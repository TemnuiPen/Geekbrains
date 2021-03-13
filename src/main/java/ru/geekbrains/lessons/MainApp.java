package ru.geekbrains.lessons;

/*
Практическое задание №12
Необходимо написать два метода, которые делают следующее:
1) Создают одномерный длинный массив
2) Заполняют этот массив единицами.
3) Засекают время выполнения: long a = System.currentTimeMillis().
4) Проходят по всему массиву и для каждой ячейки считают новое значение по формуле:
arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
5) Проверяется время окончания метода System.currentTimeMillis().
6) В консоль выводится время работы: System.out.println(System.currentTimeMillis() - a).

Отличие первого метода от второго:
Первый просто бежит по массиву и вычисляет значения.
Второй разбивает массив на два массива, в двух потоках высчитывает новые значения и потом склеивает эти массивы
обратно в один.

Пример деления одного массива на два:
System.arraycopy(arr, 0, a1, 0, h);
System.arraycopy(arr, h, a2, 0, h).

Пример обратной склейки:
System.arraycopy(a1, 0, arr, 0, h);
System.arraycopy(a2, 0, arr, h, h).
* */

public class MainApp{

    private static final int MASSIVE_SIZE = 20;
    private static final int HALF_OF_MASSIVE_SIZE = 10;

    private static final double [] array = new double[MASSIVE_SIZE]; // основной массив
    // сюда присваивается первая половина основного массива
    private final double [] array1 = new double[HALF_OF_MASSIVE_SIZE];
    private final double [] array2 = new double[MASSIVE_SIZE];// сюда присваевается вторая половина основоного массива

    // Флаги, проверяюшие выполнение функций
    private boolean firstArrayFlag = false;
    private boolean secondArrayFlag = false;
    private boolean firstMethodFlag = false;

    private final Object lock = new Object(); // замок

    public MainApp() {
        //empty
    }
    public static void main(String[] args) {
        MainApp a = new MainApp();

        Thread t1 = new Thread(() -> {
            a.countFirstArray();
        });
        Thread t2 = new Thread(() -> {
            a.countSecondArray();
        });

        Thread t4 = new Thread(() -> {
            a.sendToArrayValue();
        });
        t1.start();
        t2.start();
        t4.start();

    }

    private void sendToArrayValue() {
        synchronized (lock) {
            long timeToDo = System.currentTimeMillis();
            for (double i = 0; i < MASSIVE_SIZE; i++) {
                array[(int) i] = i * Math.sin(0.2 + i / 5) * Math.cos(0.2 + i / 5) * Math.cos(0.4 + i / 2);
                System.out.println(array[(int) i]);
            }

            long finalTimeToDo = System.currentTimeMillis();
            firstMethodFlag = true;

            sendToArrayNewValues();

            System.out.println(timeToDo);
            System.out.println(finalTimeToDo);
            System.out.println("Время выполнения первого метода: ");
            System.out.println(finalTimeToDo - timeToDo);
            System.out.println("__________________________________");

            if (firstMethodFlag) {
                lock.notifyAll();
            }
        }
    }
    // Массив array разбивается на два массива array1 и array2
    private void sendToArrayNewValues() {
        System.arraycopy(array, 0, array1, 0, HALF_OF_MASSIVE_SIZE);
        System.arraycopy(array, HALF_OF_MASSIVE_SIZE, array2, HALF_OF_MASSIVE_SIZE, HALF_OF_MASSIVE_SIZE);
    }

    // рассчитывается array1 и присваевается в основной массив
    private void countFirstArray() {
        synchronized (lock) {
            try {
                while (!firstMethodFlag) {
                    lock.wait();
                }

                for (int i = 0; i < HALF_OF_MASSIVE_SIZE; i++) {
                    array1[i] = i;
                    System.out.println("Tread-1 " + i + ": " + array1[i]);
                }

                System.arraycopy(array1, 0, array,0,HALF_OF_MASSIVE_SIZE);
                firstArrayFlag = true;

                // Если оба метода выполнены, массив печатается
                if((firstArrayFlag && secondArrayFlag)) {
                    printArray();
                }
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // рассчитывается array2 и присваевается в основной массив
    private void countSecondArray() {
         synchronized(lock) {
             try {
                 while (!firstMethodFlag) {
                     lock.wait();
                 }

                 for (int i = HALF_OF_MASSIVE_SIZE; i < MASSIVE_SIZE; i++) {
                     array2[i] = i;
                     System.out.println("Tread-2 " + i + ": " + array2[i]);
                 }

                 System.arraycopy(array2, HALF_OF_MASSIVE_SIZE, array, HALF_OF_MASSIVE_SIZE, HALF_OF_MASSIVE_SIZE);

                 secondArrayFlag = true;

                 // Если оба метода выполнены, массив печатается
                 if((firstArrayFlag && secondArrayFlag)) {
                     printArray();
                 }
             }
             catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
    }

    //печатается основной массив
    private void printArray() {
        for (int i = 0; i < MASSIVE_SIZE; i++) {
            System.out.println(i + ": " + array[i]);
        }
    }
}
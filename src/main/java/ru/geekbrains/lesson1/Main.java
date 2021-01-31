package ru.geekbrains.lesson1;
// task 1: Создать пустой проект в IntelliJ IDEA и прописать метод main().
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        calculate(5,6,9,3);
        func (5,6);
        Func(9);
        Func1(7);
        Func2(" Alexey");
        Func3(2000);
        }

            /* task 2:Создать переменные всех пройденных типов данных и инициализировать их значения.
           */

            byte x= 120;
            short y = 1200;
            int w = 120000;
            long z = 12000000;
            float e = 12000000.234f;
            double f = 1342364.12341234;
            char g = 'g';
            boolean h = true;

    //task 3: Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
    //            где a, b, c, d – аргументы этого метода, имеющие тип float
    public static float calculate(float a,float b,float c,float d){
        System.out.println(a*(b+(c/d)));
        return a*(b+(c/d));
    }
    // task 4: Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – fals
    public static boolean func(double a, double b) {
        boolean c;
        if ((a + b) > 10 && (a + b) < 20) c = true;
        else c = false;
        System.out.println(c);
        return c;
    }
    // task 5: Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void Func(double a) {
        if (a >= 0) System.out.println("Положительное число");
        else System.out.println("Отрицательное число");
    }
    // task 6: Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean Func1(double a) {
        boolean v;
        if (a < 0)  v = true;
        else v = false;
        System.out.println(v);
        return v;
    }
    //task 7: Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void Func2(String name){
        System.out.println("Привет" + name);
    }
    //task 8: *Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль. Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void Func3(int a) {
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) System.out.println("Год високосный");
        else System.out.println("Год невисокосный");


    }


}


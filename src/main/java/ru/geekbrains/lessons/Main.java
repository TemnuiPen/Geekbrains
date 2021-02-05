package ru.geekbrains.lessons;
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6([1, 3, 6, 8, 7, 6, 4, 7, 9]);
        }
    /* Задание 1: Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    * */
    private static void task1() {
        int a[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        for (int i = 0; i < 10; i++){
            if (a[i] == 1) a[i] = 0;
            else if (a[i] == 0) a[i] = 1;
        }
        System.out.println("Task 1");
        for (int i = 0; i < 10; i++){
            System.out.print(a[i]);
        }
    }
    /* Задание 2: Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    * */
    private static void task2() {
        int [] b = new int[8];
        for (int i = 0; i < 7; i++) {
            b[i + 1]= b[i] + 3;
        }
        System.out.println(" ");
        System.out.println("Task 2");
        for (int i = 0; i < 8; i++) System.out.println(b[i]);
    }
    /*Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    * */
    private static void task3() {
        int c[] ={1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < 12; i++) {
            if (c[i] < 6) c[i] = c[i] * 2;
        }
        System.out.println("Task 3");
        for (int i = 0; i < 12; i++) System.out.println(c[i]);
    }
    /*Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
     * */
    private static void task4() {
        int d[][] = new int [7][7];
        int counter = 1;
        System.out.println("Task 4");
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (i == j) d[i][j] = 1;
                System.out.print(d[i][j] + " ");
                counter++;
            }

        }
    }
    /* Задание 5: ** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
     * */
    private static void task5(){
        int e[] = {7, 4, 5, 2, 9, 10, 47};
        int max = e[1];
        int min = e[1];
        for (int i = 0; i < 7; i++) {
            if (e[i] > max) max = e[i];
            if (e[i] < min) min = e[i];
            }
        System.out.println(" ");
        System.out.println("Task 5");
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        }
    /* ** Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны. Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true, граница показана символами ||, эти символы в массив не входят.

    6  задача не запускается
    * */

    int f[] = new int [9];
    private static void task6( int f[]){
        int a = Integer.parseInt(null);
        int counter = 0;
        for (int i = 0; i < 8; i++){
            if (f[i] != a) counter++;
        }
        if (counter == 8) System.out.println("true");
        else System.out.println("false");

    }



    }











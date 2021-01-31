package ru.geekbrains.lesson1;

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

            // task 2
            byte x= 120;
            short y = 1200;
            int w = 120000;
            long z = 12000000;
            float e = 12000000.234f;
            double f = 1342364.12341234;
            char g = 'g';
            boolean h = true;

    //task 3
    public static float calculate(float a,float b,float c,float d){
        System.out.println(a*(b+(c/d)));
        return a*(b+(c/d));
    }
    // task 4
    public static boolean func(double a, double b) {
        boolean c;
        if ((a + b) > 10 && (a + b) < 20) c = true;
        else c = false;
        System.out.println(c);
        return c;
    }
    // task 5
    public static void Func(double a) {
        if (a >= 0) System.out.println("Положительное число");
        else System.out.println("Отрицательное число");
    }
    // task 6
    public static boolean Func1(double a) {
        boolean v;
        if (a < 0)  v = true;
        else v = false;
        System.out.println(v);
        return v;
    }
    //task 7
    public static void Func2(String name){
        System.out.println("Привет" + name);
    }
    //task 8
    public static void Func3(int a) {
        if ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) System.out.println("Год високосный");
        else System.out.println("Год невисокосный");


    }


}


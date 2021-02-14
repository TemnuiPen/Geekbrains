package ru.geekbrains.lessons;

public class Dog extends Animal{
    static int boarderToSwim = 10; // max to swim for dogs
    static int boarderToRun = 500; // max to run for dogs
    static int counterRun = 0; // counter of running dogs
    static int counterSwim = 0; // counter of running cats

    //@Override, без коммента почему то не работает, Идея пишет, что этот метод не переопределяет метод из суперкласса
    protected static void animalRun(String name, int length) {
        if (boarderToRun > length) {
            System.out.println(name + " ran " + length + "m");
            counterRun++;
        }
        else {
            System.out.println("It is very big distance, make it shorter.");
        }
        System.out.println("Number of running dogs is " + counterRun);
    }

    //@Override, без коммента почему то не работает, Идея пишет, что этот метод не переопределяет метод из суперкласса
    protected static void animalSwim(String name, int length) {
        if (boarderToSwim > length) {
            System.out.println(name + " swam " + length + "m");
            counterSwim++;
        }
        else {
            System.out.println("It is very big distance, make it shorter.");
        }
        System.out.println("Number of swimming dogs is " + counterSwim);
    }
}

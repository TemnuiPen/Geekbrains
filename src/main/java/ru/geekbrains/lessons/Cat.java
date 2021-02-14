package ru.geekbrains.lessons;

public class Cat extends Animal {
    static int boarderToRun = 200; // max to run for cats
    static int counterRun = 0; // counter of running cats

    //@Override, без коммента почему то не работает, Идея пишет, что этот метод не переопределяет метод из суперкласса
    protected static void animalSwim(String name, int length) {

        System.out.println("Cats cannot swim!");
    }

    //@Override, без коммента почему то не работает, Идея пишет, что этот метод не переопределяет метод из суперкласса
    protected static void animalRun(String name, int length) {
        if (boarderToRun > length) {
            System.out.println(name + " ran " + length + "m");
            counterRun++;
        }
        else {
            System.out.println("It is very big distance, make it shorter.");
        }
        System.out.println("Number of running cats is " + counterRun);
    }
}
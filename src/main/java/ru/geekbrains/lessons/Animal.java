package ru.geekbrains.lessons;

public class Animal {
    static int boarderToSwim = 100; // max to swim for animas
    static int boarderToRun = 1000; // max to run for animals
    static int counterRun = 0; // counter of running animals
    static int counterSwim = 0; // counter of swimming animals

    public Animal() {

   }

    protected static void animalRun(String name, int length) {
        if (boarderToRun > length) {
            System.out.println(name + " ran " + length + "m");
            counterRun++;
        }
        else {
            System.out.println("It is very big distance, make it shorter.");
        }
        System.out.println("Number of running animals is " + counterRun);
    }

    protected static void animalSwim(String name, int length) {
        if (boarderToSwim > length) {
            System.out.println(name + " swam " + length + "m");
            counterSwim++;
        }
        else {
            System.out.println("It is very big distance, make it shorter.");
        }
        System.out.println("Number of swimming  animals  is " + counterSwim);
    }
}

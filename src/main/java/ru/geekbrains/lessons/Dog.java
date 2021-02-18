package ru.geekbrains.lessons;

public class Dog extends Animal{
    private static final int boarderToSwim = 10; // max to swim for dogs
    private static final int boarderToRun = 500; // max to run for dogs
    int counterRun = 0; // counter of running dogs
    int counterSwim = 0; // counter of running cats
    int lengthRun; // cat's run distance
    int lengthSwim; // cat's swim distance


    public Dog(String name, int lengthRun, int lengthSwim) {
        name = this.name;
        lengthRun = this.lengthRun;
        lengthSwim = this.lengthSwim;
    }


    @Override
    protected  void animalRun(String dogsName, int dogsDistance) {
        if (dogsDistance < boarderToRun) {
            System.out.println( dogsName + " ran " + dogsDistance + "m");
            counterRun = counterRun + 1;
            System.out.println("The number of running dogs is " + counterSwim);
        }
        else System.out.println("It is very big distance.");
    }

    @Override
    protected  void animalSwim(String dogsName, int dogsDistance) {
        if (dogsDistance < boarderToSwim) {
            System.out.println(dogsName + " ran " + dogsDistance + "m");
            counterSwim = counterSwim + 1;
            System.out.println("The number of swimming dogs is " + counterSwim);
        }
    }
}

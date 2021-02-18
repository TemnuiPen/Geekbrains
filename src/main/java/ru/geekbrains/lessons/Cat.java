package ru.geekbrains.lessons;

public class Cat extends Animal {
    private static final int boarderToRun = 200; // max to run for cats
    int counterCatsRun = 0; // counter of running cats
    int lengthRun; // cat's run distance
    int lengthSwim; // cat's swim distance

    public Cat() {

    }

    public Cat(String name, int lengthRun, int lengthSwim) {
        name = this.name;
        lengthRun = this.lengthRun;
        lengthSwim = this.lengthSwim;
    }


    @Override
    protected  void animalSwim(String catsName, int catsDistance) {
        System.out.println("Cats cannot swim!");
    }

    @Override
    protected  void animalRun(String catsName, int catsDistance) {


        if (boarderToRun > catsDistance) {
            System.out.println(catsName + " ran " + catsDistance + "m");
            counterCatsRun = counterCatsRun + 1;
            System.out.println("The number of running cats is " + counterCatsRun);
        }
        else
            {
            System.out.println("It is very big distance.");
        }
    }
}
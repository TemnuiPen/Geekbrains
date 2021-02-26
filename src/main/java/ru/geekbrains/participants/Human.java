package ru.geekbrains.participants;

public class Human implements participants{
    String name; // Human's name

    private final int BOARDER_TO_RUN = 10000; // Distance that human are not able to run
    private final int BOARDER_TO_JUMP = 2; // Boarder that human are not able to jump

    public Human(String name) {
        this.name = name;
    }

    @Override
    public void run(String name, int distance) {
        if (distance < BOARDER_TO_RUN) {
            System.out.println("Human " + name + " ran " + distance + "m");
        }
        else {
            System.out.println("Human " + name + " cannot ran " + distance + "m");
        }
    }

    @Override
    public void jump(String name, int height) {
        if (height <= BOARDER_TO_JUMP) {
            System.out.println("Human " + name + " jumped the wall " + height + "m");
        }
        else {
            System.out.println("Human " + name + " cannot jump the wall " + height + "m");
        }
    }

    String getName() {
        return name;
    }

}
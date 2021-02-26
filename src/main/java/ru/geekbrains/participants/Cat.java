package ru.geekbrains.participants;

public class Cat implements participants{
    String name; // Cat's name

    private final int BOARDER_TO_RUN = 1500; // Distance that cat are not able to run
    private final double BOARDER_TO_JUMP = 1; // Boarder that cat are not able to jump

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void run(String name, int distance) {
        if (distance < BOARDER_TO_RUN) {
            System.out.println("Cat " + name + " ran " + distance + "m");
        }
        else {
            System.out.println("Cat " + name + " cannot ran " + distance + "m");
        }
    }

    @Override
    public void jump(String name, int height) {
        if (height <= BOARDER_TO_JUMP) {
            System.out.println("Cat " + name + " jumped the wall " + height + "m");
        }
        else {
            System.out.println("Cat " + name + " cannot jump the wall " + height + "m");
        }
    }

    String getName() {
        return name;
    }
}
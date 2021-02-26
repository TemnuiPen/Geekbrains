package ru.geekbrains.participants;

public class Robot implements participants{
    String name; // robot's name

    private final int BOARDER_TO_RUN = 100000; // Distance that robot are not able to run
    private final double BOARDER_TO_JUMP = 3.5; // Boarder that robot are not able to jump

    public Robot(String name) {
        this.name = name;
    }

    @Override
    public void run(String name, int distance) {
        if (distance < BOARDER_TO_RUN) {
            System.out.println("Robot " + name + " ran " + distance + "m");
        }
        else {
            System.out.println("Robot " + name + " cannot ran " + distance + "m");
        }
    }

    @Override
    public void jump(String name, int height) {
        if (height < BOARDER_TO_JUMP) {
            System.out.println("Robot " + name + " jumped the wall " + height + "m");
        }
        else {
            System.out.println("Robot " + name + " cannot jump the wall " + height + "m");
        }
    }

    String getName() {
        return name;
    }
}
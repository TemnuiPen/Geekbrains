package ru.geekbrains.lessons;

import java.util.Scanner;

public class Plate {
    private final int MAX_FOOD = 100;
    int food; // quantity of food in cat's plate
    boolean fedStatus; // Status of cat's appetite, is it hungry or it isn't
    private int appetite;

    public Plate(int food) {
        this.food = food;
    }

    // Cat eat food
    void decreaseFood(int n) {
        if (food >= n) {
            fedStatus = true;
            food -=n;
            appetite = n;
        }
        else {
            fedStatus = false;
            appetite = n;
        }
    }

    void foodInfo() {
        System.out.println("plate: " + food);
    }

    Scanner sc = new Scanner(System.in);
    void checkStatus() {
        int checkStatus; // check for user's input
        if (fedStatus) {
            System.out.println("Cat fed, everything is alright");
        }
        else {
            System.out.println("Food was not enough, give more!");
            System.out.println("Give more - 1, go out - 0");
            checkStatus = sc.nextInt();
            if (checkStatus == 1) {
                food = MAX_FOOD;
                decreaseFood(appetite);
            }
            else {
                System.out.println("Go find food by yourself!");

            }
        }
    }
}

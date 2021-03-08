package ru.geekbrains.fruits;

import java.util.Scanner;

public class Orange extends Fruit{

    public Orange() {

    }

    // User enter number of fruits
    @Override
    public int fruitAdd() {
        int orangeNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of oranges:");
        orangeNumber = sc.nextInt();
        return orangeNumber;
    }

    @Override
    public String enterFruitType() {
        return super.enterFruitType();
    }
}
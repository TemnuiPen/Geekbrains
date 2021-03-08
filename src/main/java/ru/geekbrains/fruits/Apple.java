package ru.geekbrains.fruits;

import java.util.Scanner;

public class Apple extends Fruit{

    public Apple() {

    }

    // User enter number of fruits
    @Override
    public int fruitAdd() {
        int appleNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of apples:");
        appleNumber = sc.nextInt();
        return appleNumber;
    }

    @Override
    public String enterFruitType() {
        return super.enterFruitType();
    }
}
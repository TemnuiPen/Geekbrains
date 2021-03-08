package ru.geekbrains.fruits;

import java.util.Scanner;

public abstract class Fruit {

    // User enter number of fruits
    public abstract int fruitAdd();

    // Enter type of fruit
    public String enterFruitType() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter kind of fruit: <Apple> or <Orange>");
        String fruitType = sc.nextLine();
        return fruitType;
    }
}

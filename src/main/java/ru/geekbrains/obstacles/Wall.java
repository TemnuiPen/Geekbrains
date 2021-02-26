package ru.geekbrains.obstacles;

import java.util.Scanner;

public class Wall implements obstacles{
    int length; // wall's length

    public Wall() {
        // empty
    }

    @Override
    public void printInfo(int size) {
        System.out.println("Size of the Wall: " + size);
    }

    @Override
    public int enterTheObstacle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter wall's length:");
        length = sc.nextInt();
        return length;
    }
}

package ru.geekbrains.obstacles;

import java.util.Scanner;

public class Road implements obstacles {
    int distance; // road's distance

    public Road() {
        // empty
    }

    @Override
    public void printInfo(int size) {
        System.out.println("Size of the road: " + size);
    }

    @Override
    public int enterTheObstacle() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter road's distance:");
        distance = sc.nextInt();
        return distance;
    }
}

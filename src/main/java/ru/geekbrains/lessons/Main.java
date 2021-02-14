package ru.geekbrains.lessons;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Cat.animalSwim("Barsik", 12);
        Cat.animalRun("Barsik", 100);
        Cat.animalRun("Murzik", 150);
        Cat.animalRun("Tihon", 300);
        Dog.animalSwim("Bobik", 5);
        Dog.animalSwim("Barbos", 6);
        Dog.animalSwim("Bublick", 11);
        Dog.animalRun("Bobik", 450);
        Dog.animalRun("Barbos", 460);
        Dog.animalRun("Bublick", 750);
    }
}
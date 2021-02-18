package ru.geekbrains.lessons;

import java.util.Random;
import java.util.Scanner;

public abstract class Animal {
    String name; // name
    int lengthRun; // run distance
    int lengthSwim; // swim distance

    public static void main(String[] args) {
        // Cats
        Cat cat1 = new Cat("Barsik", 100, 2);
        Cat cat2 = new Cat("Murzik", 180, 3);
        Cat cat3 = new Cat("Snegok", 230, 4);

        //Dogs
        Dog dog1 = new Dog("Bobik", 400, 8);
        Dog dog2 = new Dog("Barbos", 490, 9);
        Dog dog3 = new Dog("Sosiska", 530, 15);

        // Cat's names
        String catsName1 = cat1.getName(); // Get first cat's name
        String catsName2 = cat2.getName(); // Get second cat's name
        String catsName3 = cat3.getName(); // Get third cat's name

        // Cat's run distance
        int catsRunDistance1 = cat1.getLengthRun(); // Get first cat's distance
        int catsRunDistance2 = cat2.getLengthRun(); // Get second cat's distance
        int catsRunDistance3 = cat3.getLengthRun(); // Get third cat's distance

        //Cat's swim distance
        int catsSwimDistance1 = cat1.getLengthSwim(); // Get first cat's name
        int catsSwimDistance2 = cat2.getLengthSwim(); // Get second cat's name
        int catsSwimDistance3 = cat3.getLengthSwim(); // Get third cat's name

        //Dogs names
        String dogsName1 = dog1.getName(); // Get first cat's name
        String dogsName2 = dog2.getName(); // Get second cat's name
        String dogsName3 = dog3.getName(); // Get third cat's name

        // Dogs run distance
        int dogsRunDistance1 = dog1.getLengthRun(); // Get first dog's distance
        int dogsRunDistance2 = dog2.getLengthRun(); // Get second dog's distance
        int dogsRunDistance3 = dog3.getLengthRun(); // Get third dog's distance

        // Dogs swim distance
        int dogsSwimDistance1 = dog1.getLengthSwim(); // Get first dog's distance
        int dogsSwimDistance2 = dog2.getLengthSwim(); // Get second dog's distance
        int dogsSwimDistance3 = dog3.getLengthSwim(); // Get third dog's distance

        // Transfer value to function
        cat1.animalRun(catsName1, catsRunDistance1);
        cat2.animalRun(catsName2, catsRunDistance2);
        cat3.animalRun(catsName3, catsRunDistance3);

        // Transfer value to function
        dog1.animalRun(dogsName1, dogsRunDistance1);
        dog2.animalRun(dogsName2, dogsRunDistance2);
        dog3.animalRun(dogsName3, dogsRunDistance3);

        // Transfer value to function
        cat1.animalSwim(catsName1, catsSwimDistance1);
        cat2.animalSwim(catsName2, catsSwimDistance2);
        cat3.animalSwim(catsName3, catsSwimDistance3);

        // Transfer value to function
        dog1.animalSwim(dogsName1, dogsSwimDistance1);
        dog2.animalSwim(dogsName2, dogsSwimDistance2);
        dog3.animalSwim(dogsName3, dogsSwimDistance3);
    }

    // name's getter
    String getName() {
        return name;
    }

    // lengthRun getter
    int getLengthRun() {
        return lengthRun;
    }

    // lengthSwim getter
    int getLengthSwim() {
        return lengthSwim;
    }

    abstract void animalSwim(String name, int distance);

    abstract void animalRun(String name, int distance);
}
package ru.geekbrains.box;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Scanner;

public class Box <T>{
    private final double FRUITWEIGHT = 0.2; // weight of oranges and apples

    Scanner sc = new Scanner(System.in);

    ArrayList <Integer> arrayOfBoxes = new ArrayList<>(); // array of fruit's numbers
    ArrayList <String> arrayOfFruitTypes = new ArrayList<>(); // array of fruit types (oranges and apples)

    // calculate weight of the box
    void getWeight() {
        System.out.println("Enter box index:");
        int index = sc.nextInt();
        int number = arrayOfBoxes.get(index);
        double weight = number * FRUITWEIGHT;
        System.out.println("Box weight:" + weight);
    }

    // invert two boxes
    void changeBox() {
        System.out.println("Enter first box index:");
        int firstIndex = sc.nextInt();

        System.out.println("Enter second box index:");
        int secondIndex = sc.nextInt();

        int firstArrayValue = arrayOfBoxes.get(firstIndex);
        String firstArrayString = arrayOfFruitTypes.get(firstIndex);

        int secondArrayValue = arrayOfBoxes.get(secondIndex);
        String secondArrayString = arrayOfFruitTypes.get(secondIndex);

        arrayOfBoxes.set(firstIndex, secondArrayValue);
        arrayOfFruitTypes.set(firstIndex, secondArrayString);
        arrayOfBoxes.set(secondIndex, firstArrayValue);
        arrayOfFruitTypes.set(secondIndex, firstArrayString);
    }

    // find and compare value's of two boxes
    void compareTo() {
        System.out.println("Enter first box index:");
        int firstIndex = sc.nextInt();

        System.out.println("Enter second box index:");
        int secondIndex = sc.nextInt();

        int firstArrayValue = arrayOfBoxes.get(firstIndex);
        int secondArrayValue = arrayOfBoxes.get(secondIndex);
        String firstType = arrayOfFruitTypes.get(firstIndex);
        String secondType = arrayOfFruitTypes.get(secondIndex);

        if (firstArrayValue > secondArrayValue) {
            System.out.println(firstArrayValue + " " + firstType + "(s)" +  " > " + secondArrayValue + " " + secondType + "(s)");
        }
        else if (firstArrayValue < secondArrayValue) {
            System.out.println(firstArrayValue + " " + firstType + "(s)" +  " < " + secondArrayValue + " " + secondType + "(s)");
        }
        else if (firstArrayValue == secondArrayValue) {
            System.out.println(firstArrayValue + " " + firstType + "(s)" +  " = " + secondArrayValue + " " + secondType + "(s)");
        }
    }

    // add number in the box
    void addFruitInBox(int number) {
        arrayOfBoxes.add(number);
    }

    //add type of fruit in the box
    void addFruitTypeInBox(String type) {
        arrayOfFruitTypes.add(type);
    }

    // print boxes
    void printBoxes() {
        int length = arrayOfBoxes.size();
        for (int i = 0; i < length; i++) {
            System.out.println(arrayOfFruitTypes.get(i) + ": " + arrayOfBoxes.get(i));
        }
    }
}

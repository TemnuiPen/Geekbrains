package ru.geekbrains.box;

/*
Практическое задание №11

1) Написать метод, который меняет два элемента массива местами (массив может быть любого ссылочного типа);

2) Написать метод, который преобразует массив в ArrayList;

3) Задача:
a) Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
b) Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта, поэтому в одну коробку
нельзя сложить и яблоки, и апельсины;
c) Для хранения фруктов внутри коробки можно использовать ArrayList;
d) Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
e) Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую подадут
в compare() в качестве параметра. true – если их массы равны, false в противоположном случае. Можно сравнивать коробки
с яблоками и апельсинами;
f) Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую. Помним про сортировку фруктов:
нельзя яблоки высыпать в коробку с апельсинами. Соответственно, в текущей коробке фруктов не остается, а в другую
перекидываются объекты, которые были в первой;
g) Не забываем про метод добавления фрукта в коробку.
* */


import ru.geekbrains.fruits.Apple;
import ru.geekbrains.fruits.Fruit;
import ru.geekbrains.fruits.Orange;
import java.util.Scanner;

public class MainApp {
    static boolean flag = true; // Is used to exit program. If user enter <false> program will be finished
    private final static int NUMBER_BOARDER = 50;
    private final static String ORANGE = "Orange";
    private final static String APPLE = "Apple";

    public static void main(String[] args) {
        Box box = new Box();
        Apple apple = new Apple();
        Orange orange = new Orange();

        while(flag) {
            System.out.println("What do you want to do?\n " +
                    "To add new fruits enter <add>;\n " +
                    "To get weight from box enter <weight>;\n " +
                    "To compare boxes enter <compare>;\n " +
                    "To replace boxes enter <replace>;\n " +
                    "To print boxes enter <print>;\n " +
                    "To exit this program enter <exit>;\n ");

            String userEnter = enterLine();
            switch (userEnter) {
                case "add" -> {
                    String fruitType = apple.enterFruitType();
                    if (fruitType.equals(APPLE)) {
                        int numberOfFruits = apple.fruitAdd();
                        if (numberOfFruits <= NUMBER_BOARDER) {
                            box.addFruitInBox(numberOfFruits);
                            box.addFruitTypeInBox(fruitType);
                        }
                        else {
                            System.out.println("You can put only 50 fruits in the box");
                        }
                    }
                    else if (fruitType.equals(ORANGE)) {
                        int numberOfFruits = orange.fruitAdd();
                        if (numberOfFruits <= NUMBER_BOARDER) {
                            box.addFruitInBox(numberOfFruits);
                            box.addFruitTypeInBox(fruitType);
                        }
                        else {
                            System.out.println("You can put only 50 fruits in the box");
                        }
                    }
                }
                case "weight" -> {
                    box.getWeight();
                }
                case "compare" -> {
                    box.compareTo();
                }
                case "replace" -> {
                    box.changeBox();
                }
                case "print" -> {
                    box.printBoxes();
                }
                case "exit" -> {
                    flag = false;
                }
            }
        }
    }

    static String enterLine() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        return str;
    }
}
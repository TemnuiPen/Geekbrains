package ru.geekbrains.participants;

/*
Практическое задание №9
1) Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера
необходимо бросить исключение MyArraySizeException.
2) Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. Если в каком-то элементе
массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа), должно быть брошено
исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
3) В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
и вывести результат расчета.
* */



import com.sun.jdi.CharType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    final static int NUMBER_OF_MASSIVE_ELEMENTS = 4; // massive elements number has to be
    final static int NUMBER_OF_MASSIVE_LINES = 4; // massive lines number has to be

    static String[][] array = {
            {"34", "12", "33", "11"},
            {"34", "12", "33", "11"},
            {"34", "12", "33", "11"},
            {"34", "12", "33", "11"},
            {"34", "12", "33", "11"}
    };

    public static void main(String[] args) {

        try {
            checkArray(array);
        } catch (MyArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (MyArrayDataException d) {
            System.out.println(d.getMessage());
        }
    }

    static void checkArray(String array[][]) throws MyArraySizeException, MyArrayDataException {

        int element; // massive element in integer
        int sum = 0; // sum of massive elements
        boolean status = true; // Check for letters in massive elements
        int numberOfMassiveLines = array.length; // number of massive lines
        int numberOfElementsInMassiveLine = array[0].length; // number of massive elements

        // check massive size
        if (numberOfMassiveLines != NUMBER_OF_MASSIVE_LINES ||
                numberOfElementsInMassiveLine != NUMBER_OF_MASSIVE_ELEMENTS) {
            throw new MyArraySizeException();
        }
        else if (numberOfMassiveLines == NUMBER_OF_MASSIVE_LINES && numberOfElementsInMassiveLine == NUMBER_OF_MASSIVE_ELEMENTS) {
                System.out.println("Massive size is OK!");
        }

        // check for letters in massive
        for (int i = 0; i < NUMBER_OF_MASSIVE_ELEMENTS; i++) {
            for (int j = 0; j < NUMBER_OF_MASSIVE_ELEMENTS; j++) {

                status = isContainsChar(array[i][j]);
                if (!status) {
                        throw new MyArrayDataException();
                    }
                else {
                        element = Integer.parseInt(array[i][j]);
                        sum = sum + element;
                    }
                }
            }
        if (status) {
            System.out.println("Massive data is OK!" );
        }
    }

    static boolean isContainsChar(String line) {
        boolean status = true;
        char[] word = line.toCharArray();
        ArrayList<Character> list = new ArrayList<>();
        for (char c: word) {
            list.add(c);
        }
        int size = list.size();
        word = null;
        for (char letter = 'a'; letter < 'z'; letter++) {
            for (int i = 0; i < size; i++) {
                if (letter == list.get(i)) {
                    status = false;
                }
            }
        }
        return status;
    }
}


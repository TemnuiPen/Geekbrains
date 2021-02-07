package ru.geekbrains.lessons;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        compareFunc();
    }

    // Generate random number
    private static int randomNumber() {
        Random rand = new Random();
        return(rand.nextInt(10));
    }

    // enter user number
    private static int userNumber() {
        Scanner sc = new Scanner(System.in);
        return(sc.nextInt());
    }

    // Compare random number and user number
    private static void compareFunc() {
        int counter = 1;
        int flag;
        do {
            int randomNumber = randomNumber();
            int userNumber;
            do {
                System.out.println("Введите число от 0 до 9");
                userNumber = userNumber();
                if (randomNumber > userNumber) {
                    if (counter == 3) {
                        System.out.println("Поздравляем вас! Вы проиграли!");
                        break;}
                    else {
                        System.out.println("Число, указанное вами, больше загаданного. Попробуйте ещё раз!");
                        counter++;
                    }
                } else if (randomNumber < userNumber) {
                    if (counter == 3) {
                        System.out.println("Поздравляем вас! Вы проиграли!");
                        break; }
                    else {
                        System.out.println("Число, указанное вами, меньше загаданного. Попробуйте ещё раз!");
                        counter++;
                    }
                } else if (randomNumber == userNumber) {
                    System.out.println("Удивительно! Должна была и вам когда-нибудь улыбнуться удача!");
                    break;
                }
            }
            while (true);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            flag = userNumber();
            counter = 1;
        }
        while (flag == 1);
    }
}












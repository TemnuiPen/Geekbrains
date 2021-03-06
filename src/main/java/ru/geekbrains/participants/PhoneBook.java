package ru.geekbrains.participants;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот
телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона
по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
тогда при запросе такой фамилии должны выводиться все телефоны. Желательно не добавлять лишний функционал
(дополнительные поля (имя, отчество, адрес), взаимодействие с пользователем через консоль и т.д).
Консоль использовать только для вывода результатов проверки телефонного справочника.
 */

public class PhoneBook extends HashMap{
    HashMap<String, String> phoneBook = new HashMap<>();
    int sizeOfPhoneBook;
    public PhoneBook() {
        //empty slot
    }

    void enterValues() {
        phoneBook.put("Maltsev", "8 999");
        phoneBook.put("Dobrov", "8 800");
        phoneBook.put("Raskolnikov", "8 777");
        sizeOfPhoneBook = phoneBook.size();
    }
    void add() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key:");
        String key = sc.nextLine();
        System.out.println("Enter value:");
        String value = sc.nextLine();

        boolean checkKey = phoneBook.containsKey(key);
        if (checkKey) {
            String newValue = phoneBook.get(key) + " , " + value;
            phoneBook.remove(key);
            phoneBook.put(key, newValue);
        }
        else {
            phoneBook.put(key,value);
        }
    }
    void getValue() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter key:");
        String key = sc.nextLine();

        String valueSet =  phoneBook.get(key);
        System.out.println("Telephone number(s): " + valueSet);
    }
}

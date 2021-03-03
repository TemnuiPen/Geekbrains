package ru.geekbrains.participants;

public class MyArrayDataException extends Exception{
    @Override
    public String getMessage() {
        return "In massive you can use only numbers!";
    }
}

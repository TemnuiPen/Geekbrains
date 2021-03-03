package ru.geekbrains.participants;

public class MyArraySizeException extends Exception{
    @Override
    public String getMessage() {
        return "Wrong size, it has to be [4][4]";
    }
}

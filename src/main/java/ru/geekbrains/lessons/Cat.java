package ru.geekbrains.lessons;

public class Cat  {
    private String name;
    private int appetite;
    boolean satiety;

    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }
    void eat(Plate p) {
        p.decreaseFood(appetite);
    }
}
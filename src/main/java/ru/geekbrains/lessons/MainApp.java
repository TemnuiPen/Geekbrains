package ru.geekbrains.lessons;

/*
Практическое задание №7
1. Расширить задачу про котов и тарелки с едой.
2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды
(например, в миске 10 еды, а кот пытается покушать 15-20).
3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). Если коту удалось покушать
(хватило еды), сытость = true.
4. Считаем, что если коту мало еды в тарелке, то он её просто не трогает, то есть не может быть наполовину сыт
(это сделано для упрощения логики программы).
5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки и потом вывести информацию
о сытости котов в консоль.
6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку.
* */

public class MainApp{
    private static final int CATS_NUMBER = 4;

    public static void main(String[] args) {
        Cat[] cat = new Cat[CATS_NUMBER];
        cat[0] = new Cat("Barsik", 40, false);
        cat[1] = new Cat("Murzik", 30, false);
        cat[2] = new Cat("Apelsinka", 50, false);
        cat[3] = new Cat("Sneginka", 20, false);
        Plate plate = new Plate(100);
        plate.foodInfo();
        for (int i = 0; i < CATS_NUMBER; i++) {
            cat[i].eat(plate);
            plate.checkStatus();
            plate.foodInfo();
        }
        plate.checkStatus();
    }
}
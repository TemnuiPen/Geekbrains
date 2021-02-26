package ru.geekbrains.participants;

/*
1) Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса. Эти классы должны уметь бегать
и прыгать (методы просто выводят информацию о действии в консоль).
2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники должны выполнять
соответствующие действия (бежать или прыгать), результат выполнения печатаем в консоль
(успешно пробежал, не смог пробежать и т.д.).
3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
*4) У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.
* */

import ru.geekbrains.obstacles.Road;
import ru.geekbrains.obstacles.Wall;

import java.util.Scanner;

public class MainApp {

    final static int NUMBER_OF_OBJECTS = 3;

    public static void main(String[] args) {

        String name;
        int wallLength;
        int distance;
        boolean flag = true;

        Wall wall = new Wall();
        Road road = new Road();

        Human[] human = new Human[NUMBER_OF_OBJECTS];
        human[0] = new Human("Alexandr the Great");
        human[1] = new Human("Vladimir Vladimirovich");
        human[2] = new Human("Ricardo Milos");

        Cat[] cat = new Cat[NUMBER_OF_OBJECTS];
        cat[0] = new Cat("Murzik");
        cat[1] = new Cat("Sneginka");
        cat[2] = new Cat("Apelsinka");

        Robot[] robot = new Robot[NUMBER_OF_OBJECTS];
        robot[0] = new Robot("Verter");
        robot[1] = new Robot ("R2-D2");
        robot[2] = new Robot("C-3PO");

        while (flag) {

            System.out.println("3 humans are on position " );

            for (int i = 0; i < NUMBER_OF_OBJECTS; i++) {

                name = human[i].getName();

                distance = road.enterTheObstacle();
                road.printInfo(distance);

                human[i].run(name , distance);

                wallLength = wall.enterTheObstacle();
                wall.printInfo(wallLength);

                human[i].jump(name , wallLength);

            }

            System.out.println("3 cats are on position");

            for (int i = 0; i < NUMBER_OF_OBJECTS; i++) {

                name  = cat[i].getName();

                distance = road.enterTheObstacle();
                road.printInfo(distance);

                cat[i].run(name, distance);

                wallLength = wall.enterTheObstacle();
                wall.printInfo(wallLength);

                cat[i].jump(name, wallLength);
            }

            System.out.println("3 robots are on position" );

            for (int i = 0; i < NUMBER_OF_OBJECTS; i++) {

                name = robot[i].getName();

                distance = road.enterTheObstacle();
                road.printInfo(distance);

                robot[i].run(name, distance);

                wallLength = wall.enterTheObstacle();
                wall.printInfo(wallLength);

                robot[i].jump(name, wallLength);
            }
            Scanner sc = new Scanner(System.in);
            System.out.println("If you want to continue enter <true>, to exit enter <false>");
            flag = sc.nextBoolean();
            if (!flag) {
                break;
            }
        }
    }
}

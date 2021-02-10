package ru.geekbrains.lessons;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final char DOT_X ='X'; // player's turn on the map
    private static final char DOT_O = 'O'; // ai turn on the map
    private static final char DOT_EMPTY = '*'; // cell is empty
    private static final int SIZE = 3; // size of the map

    private static int flag = 0; // This flag is used to break up cycle while in main function and exit the game
    private static boolean checkConditions; // This variable is used to check implementation conditions of ai turn

    // game map
    private static char[][] map;

    public static void main(String[] args) {
        initMap();

        while(true) {
            playerTurn();
            checkResults();
            if (flag == 1) break;
            aiTurn();
            printMap();
            checkResults();
            if (flag == 1) break;
        }

    }

    // initializes game map
    private static void initMap() {
        map = new char [SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }

        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print(i + 1 + " ");
            for ( int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }

    // print game map in console
    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
    // Player's turn
    private static void playerTurn() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты точки  - x,y");
        int x = (sc.nextInt() - 1);
        int y = (sc.nextInt() - 1);

            if (map[y][x] == DOT_EMPTY) {
                map[y][x] = DOT_X;
            }

            else {
                System.out.println("Эта точка занята, выберите другую!");
            }
        }

    // ai turn
    private static void aiTurn() {
        aiWinTurn();
        if (!checkConditions){
            aiProtectTurn();
            if (!checkConditions) {
                aiRandomNumber();
            }
        }
    }

    // random ai turn
    private static void aiRandomNumber() {
        Random rand = new Random();
        int x = rand.nextInt(3);
        int y = rand.nextInt(3);

        while(true) {
            if (map[y][x] == DOT_EMPTY) {
                map[y][x] = DOT_O;
                break;
            }

            else {
                x = rand.nextInt(3);
                y = rand.nextInt(3);
            }
        }
    }

    // Ai check his opportunity to win
    private static void aiWinTurn() {
        checkConditions = false;

        if (map[0][0] == DOT_EMPTY && map[0][1] == DOT_O && map[0][2] == DOT_O) {
            map[0][0] = DOT_O;
            checkConditions = true;
        } else if (map[0][0] == DOT_O && map[0][1] == DOT_EMPTY && map[0][2] == DOT_O) {
            map[0][1] = DOT_O;
            checkConditions = true;
        } else if (map[0][0] == DOT_O && map[0][1] == DOT_O && map[0][2] == DOT_EMPTY) {
            map[0][2] = DOT_O;
            checkConditions = true;
        }

        //next line
        else if (map[1][0] == DOT_EMPTY && map[1][1] == DOT_O && map[1][2] == DOT_O) {
            map[1][0] = DOT_O;
            checkConditions = true;
        } else if (map[1][0] == DOT_O && map[1][1] == DOT_EMPTY && map[1][2] == DOT_O) {
            map[1][1] = DOT_O;
            checkConditions = true;
        } else if (map[1][0] == DOT_O && map[1][1] == DOT_O && map[1][2] == DOT_EMPTY) {
            map[1][2] = DOT_O;
            checkConditions = true;
        }

        //next line
        else if (map[2][0] == DOT_EMPTY && map[2][1] == DOT_O && map[2][2] == DOT_O) {
            map[2][0] = DOT_O;
            checkConditions = true;
        } else if (map[2][0] == DOT_O && map[2][1] == DOT_EMPTY && map[2][2] == DOT_O) {
            map[2][1] = DOT_O;
            checkConditions = true;
        } else if (map[2][0] == DOT_O && map[2][1] == DOT_O && map[2][2] == DOT_EMPTY) {
            map[2][2] = DOT_O;
            checkConditions = true;
        }

        // next line
        else if (map[0][0] == DOT_EMPTY && map[1][0] == DOT_O && map[2][0] == DOT_O) {
            map[0][0] = DOT_O;
            checkConditions = true;
        } else if (map[0][0] == DOT_O && map[1][0] == DOT_EMPTY && map[2][0] == DOT_O) {
            map[1][0] = DOT_O;
            checkConditions = true;
        } else if (map[0][0] == DOT_O && map[1][0] == DOT_O && map[2][0] == DOT_EMPTY) {
            map[2][0] = DOT_O;
            checkConditions = true;

        // next line
        } else if (map[0][1] == DOT_EMPTY && map[1][1] == DOT_O && map[2][1] == DOT_O) {
            map[0][1] = DOT_O;
            checkConditions = true;
        } else if (map[0][1] == DOT_O && map[1][1] == DOT_EMPTY && map[2][1] == DOT_O) {
            map[1][1] = DOT_O;
            checkConditions = true;
        } else if (map[0][1] == DOT_O && map[1][1] == DOT_O && map[2][1] == DOT_EMPTY) {
            map[2][1] = DOT_O;
            checkConditions = true;
        }

        // next line
        else if (map[0][2] == DOT_EMPTY && map[1][2] == DOT_O && map[2][2] == DOT_O) {
            map[0][2] = DOT_O;
            checkConditions = true;
        } else if (map[0][2] == DOT_O && map[1][2] == DOT_EMPTY && map[2][2] == DOT_O) {
            map[1][2] = DOT_O;
            checkConditions = true;
        } else if (map[0][2] == DOT_O && map[1][2] == DOT_O && map[2][2] == DOT_EMPTY) {
            map[2][2] = DOT_O;
            checkConditions = true;
        }

        // next line
        else if (map[0][0] == DOT_EMPTY && map[1][1] == DOT_O && map[2][2] == DOT_O) {
            map[0][0] = DOT_O;
            checkConditions = true;
        }
        else if (map[0][0] == DOT_O && map[1][1] == DOT_EMPTY && map[2][2] == DOT_O) {
            map[1][1] = DOT_O;
            checkConditions = true;
        }
        else if (map[0][0] == DOT_O && map[1][1] == DOT_O && map[2][2] == DOT_EMPTY) {
            map[2][2] = DOT_O;
            checkConditions = true;

        // next line
        }
        else if(map[2][0] == DOT_EMPTY && map[1][1] == DOT_O && map[0][2] == DOT_O) {
            map[2][0] = DOT_O;
            checkConditions = true;
        }
        else if(map[2][0] == DOT_O && map[1][1] == DOT_EMPTY && map[0][2] == DOT_O) {
            map[1][1] = DOT_O;
            checkConditions = true;
        }
        else if(map[2][0] == DOT_O && map[1][1] == DOT_O && map[0][2] == DOT_EMPTY) {
            map[0][2] = DOT_O;
            checkConditions = true;
        }
    }
    // Ai check player's opportunity to win
    private static void aiProtectTurn() {

        if (map[0][0] == DOT_EMPTY && map[0][1] == DOT_X && map[0][2] == DOT_X) {
            map[0][0] = DOT_O;
            checkConditions = true;
        } else if (map[0][0] == DOT_X && map[0][1] == DOT_EMPTY && map[0][2] == DOT_X) {
            map[0][1] = DOT_O;
            checkConditions = true;
        } else if (map[0][0] == DOT_X && map[0][1] == DOT_X && map[0][2] == DOT_EMPTY) {
            map[0][2] = DOT_O;
            checkConditions = true;
        }

        //next line
        else if (map[1][0] == DOT_EMPTY && map[1][1] == DOT_X && map[1][2] == DOT_X) {
            map[1][0] = DOT_O;
            checkConditions = true;
        } else if (map[1][0] == DOT_X && map[1][1] == DOT_EMPTY && map[1][2] == DOT_X) {
            map[1][1] = DOT_O;
            checkConditions = true;
        } else if (map[1][0] == DOT_X && map[1][1] == DOT_X && map[1][2] == DOT_EMPTY) {
            map[1][2] = DOT_O;
            checkConditions = true;
        }

        //next line
        else if (map[2][0] == DOT_EMPTY && map[2][1] == DOT_X && map[2][2] == DOT_X) {
            map[2][0] = DOT_O;
            checkConditions = true;
        } else if (map[2][0] == DOT_X && map[2][1] == DOT_EMPTY && map[2][2] == DOT_X) {
            map[2][1] = DOT_O;
            checkConditions = true;
        } else if (map[2][0] == DOT_X && map[2][1] == DOT_X && map[2][2] == DOT_EMPTY) {
            map[2][2] = DOT_O;
            checkConditions = true;
        }

        // next line
        else if (map[0][0] == DOT_EMPTY && map[1][0] == DOT_X && map[2][0] == DOT_X) {
            map[0][0] = DOT_O;
            checkConditions = true;
        } else if (map[0][0] == DOT_X && map[1][0] == DOT_EMPTY && map[2][0] == DOT_X) {
            map[1][0] = DOT_O;
            checkConditions = true;
        } else if (map[0][0] == DOT_X && map[1][0] == DOT_X && map[2][0] == DOT_EMPTY) {
            map[2][0] = DOT_O;
            checkConditions = true;

        //next line
        } else if (map[0][1] == DOT_EMPTY && map[1][1] == DOT_X && map[2][1] == DOT_X) {
            map[0][1] = DOT_O;
            checkConditions = true;
        } else if (map[0][1] == DOT_X && map[1][1] == DOT_EMPTY && map[2][1] == DOT_X) {
            map[1][1] = DOT_O;
            checkConditions = true;
        } else if (map[0][1] == DOT_X && map[1][1] == DOT_X && map[2][1] == DOT_EMPTY) {
            map[2][1] = DOT_O;
            checkConditions = true;
        }

        // next line
        else if (map[0][2] == DOT_EMPTY && map[1][2] == DOT_X && map[2][2] == DOT_X) {
            map[0][2] = DOT_O;
            checkConditions = true;
        } else if (map[0][2] == DOT_X && map[1][2] == DOT_EMPTY && map[2][2] == DOT_X) {
            map[1][2] = DOT_O;
            checkConditions = true;
        } else if (map[0][2] == DOT_X && map[1][2] == DOT_X && map[2][2] == DOT_EMPTY) {
            map[2][2] = DOT_O;
            checkConditions = true;
        }

        // next line
        else if (map[0][0] == DOT_EMPTY && map[1][1] == DOT_X && map[2][2] == DOT_X) {
            map[0][0] = DOT_O;
            checkConditions = true;
        }
        else if (map[0][0] == DOT_X && map[1][1] == DOT_EMPTY && map[2][2] == DOT_X) {
            map[1][1] = DOT_O;
            checkConditions = true;
        }
        else if (map[0][0] == DOT_X && map[1][1] == DOT_X && map[2][2] == DOT_EMPTY) {
            map[2][2] = DOT_O;
            checkConditions = true;

        // next line
        }
        else if(map[2][0] == DOT_EMPTY && map[1][1] == DOT_X && map[0][2] == DOT_X) {
            map[2][0] = DOT_O;
            checkConditions = true;
        }
        else if(map[2][0] == DOT_X && map[1][1] == DOT_EMPTY && map[0][2] == DOT_X) {
            map[1][1] = DOT_O;
            checkConditions = true;
        }
        else if(map[2][0] == DOT_X && map[1][1] == DOT_X && map[0][2] == DOT_EMPTY) {
            map[0][2] = DOT_O;
            checkConditions = true;
        }
    }

    // Check conditions for win ai or player
    private static boolean checkForWin(char symb) {
        boolean result;

        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) result = true;
        else if(map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) result = true;
        else if(map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) result = true;

        else if(map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) result = true;
        else if(map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) result = true;
        else if(map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) result = true;

        else if(map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) result = true;
        else if(map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) result = true;



        else result = false;
        return result;
    }

    // Check results of user's input. If user input 1, game will restart. Else if user input 0, user will exit the game.
    private static int checkForNextGame() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Для продолжения игры нажмите 1, хотите выйти - нажите 0");
        int x = sc.nextInt();
        return x;
    }

    // Check results of user's input. If user input 1, game will restart. Else if user input 0, user will exit the game.
    private static void checkResults() {
        boolean playerResult;
        boolean aiResult;

        playerResult = checkForWin(DOT_X);
        aiResult = checkForWin(DOT_O);

        //Check for player's win
        if (playerResult) {
            System.out.println("Удивительно! Вы победили!");
            int x = checkForNextGame();

            if (x == 0) {
                flag++;
            }

            else if (x == 1) {
                restartGame();
            }
        }

        //Check for ai's win
        else if (aiResult) {
            System.out.println("Поздравляем вас! Вы проиграли!");
            int x = checkForNextGame();

            if (x == 0) {
                flag++;
            }

            else if (x == 1) {
                restartGame();
            }
        }

        // Check for draw
        else if (map[0][0] != DOT_EMPTY && map[0][1] != DOT_EMPTY && map[0][2] != DOT_EMPTY && map[1][0] != DOT_EMPTY
                && map[1][1] != DOT_EMPTY && map[1][2] != DOT_EMPTY && map[2][0] != DOT_EMPTY && map[2][1] != DOT_EMPTY
                && map[2][2] != DOT_EMPTY ) {
                    System.out.println("Ничья, победила дружба!");
                    int x = checkForNextGame();

                    if (x == 0) {
                        flag++;
                    }

                    else if (x == 1) {
                        restartGame();
                    }
        }
    }

    // Assign DOT_EMPTY to all massive elements
    private static void restartGame() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
            flag = 0;
        }
    }
}
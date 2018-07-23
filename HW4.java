/**
 * @authors Dmitry Shamaev
 * @version dated Jul 20.07.2018
 */

import java.util.Scanner;
import java.util.Random;

class TicTacToe {

    final int SIZE = 3;
    final char PE = 'x';
    final char PC = 'o';
    final char NU = '.';
    char[][] map = new char[SIZE][SIZE];
    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    public static void main(String[] args) {
        new TicTacToe();
    }

    TicTacToe () {
        initMap();
        printMap();

        while (true) {
            hodPE();
            printMap();
            if (komb(PE)) {
                System.out.println("Вы победили!");
                break;
            }
            if (fullMap()) {
                System.out.println("Ничья!");
                break;
            }

            hodPC();
            printMap();

            if (komb(PC)) {
                System.out.println("Проигрыш!");
                break;
            }
            if (fullMap()) {
                System.out.println("Ничья!");
                break;
            }
        }
        System.out.println("Конец игры");

    }

    void initMap() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = NU;
            }
        }
    }
    void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i+1) +  " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    void hodPE() {
        int x, y;
        do {
            System.out.println("Введите координаты X и Y");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!pravilo(x, y));
        map[x][y] = PE;


    }
    boolean pravilo(int x, int y){
        if (x<0 || x>=SIZE || y<0 || y>=SIZE) return false;
        if (map[x][y] == NU) return true;
        return false;
    }

    void hodPC() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!pravilo(x, y));

        System.out.println("Компьютер ввёл " + (x+1) + (y+1));
        map[x][y] = PC;
    }

    boolean komb(char a){
        int d1 = 0;
        int d2 = 0;
        for (int i = 0; i < SIZE; i++) {
            int v = 0;
            int g = 0;
<<<<<<< HEAD

=======
            
>>>>>>> 72d9c61a14faea13df787a9bc2f8461e9d98d72b
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == a) v++;
                if (map[j][i] == a) g++;

<<<<<<< HEAD
<<<<<<< HEAD
                if (i == j && map[i][j] == a) d1++;
                if (i + j == 2 && map[j][i] == a) d2++;
=======
//                if (i == j || map[i][j] == a) d1++;
//                if (i + j == 2 || map[i][j] == a) d2++;
>>>>>>> 63a70343df0accc0fe2ddc34eddb882c17d63ce6
            }
            if (v == 3) return true;
            if (g == 3) return true;
            

=======
                if (i == j || map[i][j] == a) d1++;
                if (i + j == 2 || map[i][j] == a) d2++;
            }
            if (v == 3) return true;
            if (g == 3) return true;
>>>>>>> 72d9c61a14faea13df787a9bc2f8461e9d98d72b
        }
        if (d1 == 3) return true;
        if (d2 == 3) return true;
        return false;
    }

    boolean fullMap () {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == NU) return false;
            }
        }
        return true;
    }
}

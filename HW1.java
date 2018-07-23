package geekbrains.java1HW1;

/**
    * @authors Dmitry Shamaev
    * @version dated Jul 09.07.2018
*/

import com.sun.nio.sctp.SctpSocketOption;

public class Main {

    // 2.
    public static void main(String[] z1) {

        // 2.
        // Примитивные типы данных

//        byte a = 100;        // Целые числа 8 бит
//        final short b = 1000;      // Целые числа 16 бит
//        int c = 25000;       // Целые числа 32 бит
//        long d = -25000L;    // Целые числа 64 бит
//        float e = 25.1f;     // Числа с плавающей запятой 32 бит
//        double f = 25.1234;  // Числа с плавающей запятой 64 бит
//        boolean g = false;   // Логическая переменная
//        char h = 'A';        // Символьная переменная



        System.out.println(exp3(2, 2, 2, 2)); // Проверка задания №3
        System.out.println(exp4(5, 10)); // Проверка задания №4
        exp5(10); // Проверка задания №5
        System.out.println(exp6(5)); // Проверка задания №6
        exp7("Дмитрий Шамаев"); // Проверка задания №7
        exp8(1640); // Проверка задания №7


    }

    // 3.
    static int exp3(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // 4.
    static boolean exp4(int a, int b) {
        if ((a + b) < 10 || (a + b) > 20) {
            return false;
        } else {
            return true;
        }
    }

    // 5.
    public static void exp5(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    // 6.
    static boolean exp6(int a) {
        if (a < 0) {
            return true;
        } else {
            return false;
        }
    }

    //  7.
    public static void exp7(String name) {
        System.out.println("Привет, меня зовут " + name);
    }

    //  8.
    public static void exp8(int y) {
        if ( y % 4 == 0 && y % 100 != 0) {
            System.out.println(y + " год високосный");
        } else if (y % 400 == 0) {
            System.out.println(y + " год високосный");
        } else {
            System.out.println(y + " год не високосный");
        }
    }

}

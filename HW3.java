/**
 * @authors Dmitry Shamaev
 * @version dated Jul 20.07.2018
 */

import java.util.Scanner;
import java.util.Random;


public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args) {



/*
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
                "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int rnd = new Random().nextInt(words.length);
        System.out.println(words[rnd] + " - это для теста");
        String word1 = words[rnd];

        System.out.println("Введите слово");
        String word2 = sc.nextLine();



        String[] a = {"#","#","#","#","#","#","#","#","#","#","#","#","#","#","#"};

        int SizeWord1 = word1.length();
        int SizeWord2 = word2.length();
        int SizeWord;

        if (SizeWord2 > SizeWord1){
            SizeWord = SizeWord1;
        } else {
            SizeWord = SizeWord2;
        }

        for (int i = 0; i < SizeWord; i++) {
            if (word1.charAt(i) == word2.charAt(i)) {
                a[i] = String.valueOf(word2.charAt(i));
            }
        }

        print1DArray(a);

        for (int i = 0; i < SizeWord; i++) {
            if (SizeWord2 == SizeWord1 && word1.charAt(i) == word2.charAt(i)) {
                System.out.println("Вы угадали!");
            } else {
                System.out.println("Вы не угадали!");
            }
        }

*/

        Label:
        do {

            int number = random.nextInt(10);
            System.out.println("Загаданной число = " + number  + " - это для теста");



            for (int i = 1, j = 2; i <= 3; i++, j--) {
                int d = getNumberFromS("Введите число в пределах от 0 до 9", 0, 9);
            //    System.out.println("Вы ввели = " + d);

                if (d == number) {
                    System.out.println("Вы выиграли!");
                    break;
                } else if (d < number){
                    System.out.println("Загаданное число больше. Осталось попыток: " + j);
                } else {
                    System.out.println("Загаданное число меньше. Осталось попыток: " + j);
                }
                if (j==0) {
                    System.out.println("Вы проиграли!");
                    break;
                }

            }


            while (true) {
                System.out.println("Сыграть ещё? 1 -да / 0 - нет ");
                int x = sc.nextInt();
                System.out.println("Вы ввели = " + x);
                if (x == 0) {
                    System.out.println("Конец игры");
                    break Label;
                } else if (x == 1) {
                    System.out.println("Давай еще разок!");
                    break;
                } else {
                    System.out.println("Я понимаю только 1 либо 0");
                }
            }


        } while (true);

    }

    public static void print1DArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }





    public static int getNumberFromS(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }

}

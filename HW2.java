import java.util.Arrays;

public class Main {

    public static void main (String[] args) {

        exp1();
        exp2();
        exp3();
        exp4(5);
        exp5();

        int[] arr = new int[10];
        System.out.print(Arrays.toString(arr));
    }

    static void exp1() {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) arr[i] = (int)(Math.random()*2);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    static void exp2() {
         int[] arr = new int[8];
         for (int i = 0, j=0; i < arr.length; i++, j+=3) {
             arr[i]=j;
         }
         System.out.print(Arrays.toString(arr));
    }

    static void exp3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] = arr[i] * 2;
        }
        System.out.print(Arrays.toString(arr));
    }

    static void  exp4(int size) {
        int[][] arr = new int[size][size];
        int next = 1;

        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            arr[i][size - i - 1] = 1;
        }
        System.out.println(Arrays.toString(arr));

    }

    static void  exp5() {
        int[] arr = {1,2,3};
    }


}





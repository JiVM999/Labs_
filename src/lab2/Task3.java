package lab2;

import java.util.Random;

public class Task3 {

    private static void printArr(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }

    public static void method() {
        System.out.println("\nЗадание 3: \n");
        int[][] array = new int[5][5];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = random.nextInt(-50, 50);
            }
        }

        System.out.println("Начальный массив: ");
        printArr(array);

        System.out.println("Произведения положительных чисел: ");
        for (int i = 0; i < array.length; i++) {
            int column = 1;
            for (int[] ints : array) {
                if (ints[i] >= 0) {
                    column *= ints[i];
                }
            }
            System.out.print(column + " ");
        }
        System.out.println();
    }
}

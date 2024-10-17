package lab2;

import java.util.Random;

public class Task1 {

    private static void printArr(double[] arr) {
        for (double i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void method() {
        System.out.println("\nЗадание 1: \n");
        double[] array = new double[10];
        Random random = new Random();
        double max = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextDouble(0, 100);
            if (max < array[i]) {
                max = array[i];
            }
        }

        System.out.println("Начальный массив: ");
        printArr(array);

        for (int i = 0; i < array.length; i++) {
            array[i] /= max;
        }

        System.out.println("Результирующий массив: ");
        printArr(array);
    }
}

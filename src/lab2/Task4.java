package lab2;

public class Task4 {
    public static void method() {
        System.out.println("\nЗадание 4: \n");
        int[][] matrix = {
                {1, -2, 3, 4},
                {5, -6, -7, 8},
                {9, 10, -11, 12},
                {-13, 14, 15, 16}
        };

        int maxNegative = Integer.MIN_VALUE;
        boolean foundNegative = false;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = matrix.length - 1 - i; j < matrix.length; j++) {
                if (matrix[i][j] < 0) {
                    foundNegative = true;
                    if (matrix[i][j] > maxNegative) {
                        maxNegative = matrix[i][j];
                    }
                }
            }
        }

        if (foundNegative) {
            System.out.println(maxNegative);
        } else {
            throw new RuntimeException("Нет отрицательных элементов");
        }
    }
}

package lab2;

public class Task2 {

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void selectionSort(int[] array) {
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }

    public static void method() {
        System.out.println("\nЗадание 2: \n");
        int[] array = {9, 12, 42, 0, 9, 5, 0, 6, 81, 23};

        System.out.println("Начальный массив: ");
        printArr(array);

        int targetIndex = 0;
        for (int sourceIndex = 0; sourceIndex < array.length; sourceIndex++) {
            if (array[sourceIndex] != 0) {
                array[targetIndex++] = array[sourceIndex] / 5;
            }
        }
        int[] newArray = new int[targetIndex];
        System.arraycopy(array, 0, newArray, 0, targetIndex);

        selectionSort(newArray);

        System.out.println("Результирующий массив: ");
        printArr(newArray);
    }
}

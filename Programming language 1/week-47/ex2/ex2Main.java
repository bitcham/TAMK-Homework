package ex2;

import java.util.Arrays;
import java.util.Scanner;

public class ex2Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many lines do you want? ");
        int lines = scanner.nextInt();
        int[][] arr = generateUniqueRandomArray(lines, 7, 1, 40);
        for (int[] subArray : arr) {
            Arrays.sort(subArray);
        }
        printArray(arr);
        scanner.close();
    }

    private static int[][] generateUniqueRandomArray(int lines, int size, int min, int max) {
        int[][] arr = new int[lines][size];
        int j = 0;
        while (j < lines) {
            int i = 0;
            while (i < arr[j].length) {
                int num = (int)(Math.random() * (max - min + 1)) + min;
                boolean isDuplicate = false;

                for (int k = 0; k < i; k++) {
                    if (arr[j][k] == num) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (!isDuplicate) {
                    arr[j][i] = num;
                    i++;
                }
            }
            j++;
        }
        return arr;
    }

    private static void printArray(int[][] arr) {
        System.out.println("\nLotto numbers:");
        for (int[] subArray : arr) {
            for (int it : subArray) {
                System.out.print(it + " ");
            }
            System.out.println();
        }
    }
}

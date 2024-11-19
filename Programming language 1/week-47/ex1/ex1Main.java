package ex1;

import java.util.Arrays;

public class ex1Main {
    public static void main(String[] args) {
        int[] arr = generateUniqueRandomArray(7, 1, 40);
        Arrays.sort(arr);
        printArray(arr);
    }

    private static int[] generateUniqueRandomArray(int size, int min, int max) {
        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            int num = (int)(Math.random() * (max - min + 1)) + min;
            boolean isDuplicate = false;
            
            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                arr[i] = num;
                i++;
            }
        }
        return arr;
    }

    private static void printArray(int[] arr) {
        System.out.println("\nLotto numbers:");
        for (int it : arr) {
            System.out.print(it + " ");
        }
    }
}
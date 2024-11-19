package ex3;
import java.util.Scanner;
import java.util.Arrays;

public class ex3Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many lines do you want? ");
        int lines = scanner.nextInt();
        scanner.nextLine(); 
        
        int[][] arr = new int[lines][7];
        int j = 0;
        
        while(j < lines) {
            generateLottoNumbers(arr[j]);
            
            Arrays.sort(arr[j]);
            printNumbers(arr[j]);
            
            System.out.println("Do you want to save this line? (y/n)");
            String input = scanner.nextLine().trim().toLowerCase();
            
            if(input.equals("y")) {
                j++;
            }
        }
        
        System.out.println("\nLotto numbers:");
        for(int[] row : arr) {
            printNumbers(row);
        }
        
        scanner.close();
    }
    
    private static void generateLottoNumbers(int[] numbers) {
        int i = 0;
        while (i < numbers.length) {
            int num = (int)(Math.random() * 40) + 1;
            if(!containsNumber(numbers, num, i)) {
                numbers[i++] = num;
            }
        }
    }
    
    private static boolean containsNumber(int[] arr, int num, int length) {
        for(int i = 0; i < length; i++) {
            if(arr[i] == num) return true;
        }
        return false;
    }
    
    private static void printNumbers(int[] numbers) {
        for(int num : numbers) {
            System.out.printf("%d ", num);
        }
        System.out.println();
    }
}
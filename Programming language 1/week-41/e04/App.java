/*
    Exercise 4
    Directory: w41/e04
    Objective:
        - Write a program that asks the user to enter 10 integers and store it in an array. 
        - Calculate the sum of the values entered in a separate loop and finally display the sum and average of the values.
    Expected Output:
                Enter a number: 5
                Enter a number: 7
                Sum: 12
                Average: 6 
*/

import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[10];
        
        System.out.println("Please enter 10 numbers.");

        for(int i = 0; i < 10; i++){
            System.out.print("Enter a number: ");
            number[i] = scanner.nextInt();
        }

        int sum = 0;
        for(int i = 0; i < 10; i++){
            sum += number[i];
        }

        System.out.printf("Sum : %d", sum).println();
        System.out.printf("Average: %d", sum / 10).println();
        
        scanner.close();
    }
}
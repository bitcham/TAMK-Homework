/*
    Exercise 5
    Directory: w43/e05
    Objective:
        - Write a program that will add two numbers together. 
        - Ask the numbers from the user. 
        - Create a method called add() that will do the addition of the two numbers and return the sum of the numbers. 
        - Display the result to the user.
    Expected Output:
                Give a number:
                5
                Give a number:
                6
                Sum: 11
*/
import java.util.Scanner;
public class Exercise5 {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE 
        Scanner scanner = new Scanner(System.in);
        Integer[] nums = new Integer[2];
        for (int i = 0; i < 2; i++){
            System.out.println("Give a number: ");
            nums[i] = scanner.nextInt();
        }
        System.out.println("Sum: " + add(nums[0], nums[1]));
        scanner.close();
    }

    public static int add(int a, int b){
        return a + b;
    }

}
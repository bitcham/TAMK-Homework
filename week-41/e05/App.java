/*
    Exercise 5
    Directory: w41/e05
    Objective:
        - Write a program that asks the user how many names to enter
        - Next ask the user to enter the names 
        - Store the names in an array
        - Sort through the array and display the longest name entered to the user.
    Expected Output:
                How many names to enter: 3
                Enter name: John
                Enter name: Sam
                Enter name: Elizabeth
                Longest name entered was Elizabeth 
*/
import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many names to enter: ");
        int n = scanner.nextInt() + 1;
        String[] names = new String[n];

        for (int i = 0; i < n; i++){
            System.out.print("Enter name: ");
            names[i] = scanner.nextLine();
        }

        String longestName = names[0];
        for (int i = 0; i < n-1; i++){
            if(names[i].length() < names[i+1].length()){
                longestName = names[i+1];
            }
        }

        System.out.println("Longest name entered was " + longestName);

        scanner.close();


    }
}
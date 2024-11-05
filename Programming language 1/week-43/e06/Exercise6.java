/*
    Exercise 6 
    Directory: w43/e06
    Objective:
        - Implement a method that have two parameters, mark (string) and count (int). 
        - The method will display the mark for the amount of times given in count.
        - Ask the user for the mark and the amount.:w
    Expected Output:
                Give a character:
                M
                Give an amount:
                6
                MMMMMM
*/
import java.util.Scanner;

public class Exercise6 {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Scanner scanner = new Scanner(System.in);
        String a;
        int b;
        System.out.println("Give a character: ");
        a = scanner.nextLine();
        System.out.println("Give an amount: ");
        b = scanner.nextInt();
        countMark(a, b);
        scanner.close();
    }

    public static void countMark(String mark, int count){
        for(int i = 0; i < count; i++){
            System.out.print(mark);
        }

    }
}
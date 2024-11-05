/*
    Exercise 8
    Directory: w43/e08
    Objective:
        - Use the code you wrote in 07 and copy it to e08/Exercise8.java. 
        - Change the program to ask the vertical height from the user and display the result like below.
    Expected Output:
                Give a character:
                H
                Give width:
                4
                Give height:
                4
                HHHH
                HHHH
                HHHH
                HHHH
*/

import java.util.Scanner;

public class Exercise8 {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Scanner scanner = new Scanner(System.in);
        String a;
        int b, c;
        System.out.println("Give a character: ");
        a = scanner.nextLine();
        System.out.println("Give a width: ");
        b = scanner.nextInt();
        System.out.println("Give a height: ");
        c = scanner.nextInt();
        String result = printMark(a, b, c);
        System.out.print(result);
        scanner.close();
    }
    

    public static String printMark(String mark, int width, int height) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                result.append(mark);
            }
            result.append("\n");
        }
        return result.toString();
    }
}
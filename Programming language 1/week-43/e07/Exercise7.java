/*
    Exercise 7
    Directory: w43/e07
    Objective:
        - Use the code you wrote in 06 and copy it to e07/Exercise7.java. 
        - Change the method not to display the marks but to generate the output and return it as a string and print it from where it was called.
    Expected Output: 
                Give a character:
                E
                Give an amount:
                3
                EEE

*/

import java.util.Scanner;

public class Exercise7 {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Scanner scanner = new Scanner(System.in);
        String a;
        int b;
        System.out.println("Give a character: ");
        a = scanner.nextLine();
        System.out.println("Give an amount: ");
        b = scanner.nextInt();
        System.out.println(printMark(a, b));
        scanner.close();
    }
    

    public static StringBuilder printMark(String mark, int count){
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < count; i++){
            str.append(mark);
        }
        return str;
    }
}
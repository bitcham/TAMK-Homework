/*
    Exercise 1
    Directory: w41/e01
    Objective:
        - Write a program that will create an array with the values 12, 99, 32. 
        - Display the first(12) and the last(32) number.
        - Extend the program by also displaying the length of the array.
    Expected Output:
                12
                32
                Length: 3
*/

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        int number[] = {12, 99, 32};
        int n = number.length;
        System.out.println(number[0]);
        System.out.println(number[n - 1]);
        System.out.printf("Length : %d", n);
        
    }
}
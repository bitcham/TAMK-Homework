/*
    Exercise 1
    Directory: w44/e01
    Objective:
        -  Write a program with a method called add that takes two integers as parameters,
            adds them, and returns the result.
    Expected Output:
        - Print the sum of two numbers, e.g., “The sum is: 15” for inputs 7 and 8.
*/

class Exercise1 {
    public static void main(String [] args) {
        // YOUR CODE GOES HERE
        add(7, 8); 
    }

    public static void add(int a, int b) {
        System.out.println("The sum is: " + (a + b));
    }
}
/*
    Exercise 2
    Directory: w44/e02
    Objective: 
        - Create a method called greet that takes a String name as a parameter and prints "Hello, [name]!".
    Expected Output:
        - Print a greeting message like "Hello, Alice!" when the method is called with "Alice".
*/

class Exercise2 {
    public static void main(String [] args) {
        // YOUR CODE GOES HERE 
        greet("Alice"); 
    }

    public static void greet(String name) {
        // YOUR CODE GOES HERE 
        System.out.printf("Hello, %s!", name); 
    }
}
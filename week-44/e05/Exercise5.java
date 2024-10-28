/*
    Exercise 5
    Directory: w44/e05
    Objective:
        - Overload the greet method to:
          - Greet a user by name.
          - Greet a user by name and time of day (e.g., "Good morning, [name]!").
    Expected Output:
          - Print both forms of greeting. E.g., "Hello, Sam!" and "Good evening, Sam!"
*/

public class Exercise5 {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        greet("Sam");
        greet("Sam", "morning");
        greet("Sam", "evening");
    }

    public static void greet(String name) {
        // YOUR CODE GOES HERE 
        System.out.printf("Hello, %s!\n", name);
    }

    public static void greet(String name, String timeOfDay) {
        // YOUR CODE GOES HERE
        System.out.printf("Good %s, %s!\n", timeOfDay, name);
    }
}
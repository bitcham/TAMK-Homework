/*
    Exercise 3
    Directory: w43/e03
    Objective:
        - Change the program to ask the the user to enter a name. 
        - Display the given name to user using the printName()method.
    Expected Output:
                Give a name:
                Clint
                Clint
*/
import java.util.Scanner;

class Exercise3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a name: ");
        String n = scanner.nextLine();
        printName(n);
        scanner.close();
        
    }

    public static void printName(String name) {
        // YOUR CODE GOES HERE
        System.out.println(name);

    }
}
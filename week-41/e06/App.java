/*
    Exercise 6 
    Directory: w41/e06
    Objective:
        - Write a program that will display a random integer between 0 and 2. 
        - Expand the program to randomly display rock, paper or scissors. 
    Expected Output:
*/
import java.util.Random;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        String[] game = {"rock", "paper", "scissors"};
        Random random = new Random();

        int randomNumber = random.nextInt(3);

        System.out.println("Random integer is " + randomNumber);
        System.out.println(game[randomNumber]);
    }
}
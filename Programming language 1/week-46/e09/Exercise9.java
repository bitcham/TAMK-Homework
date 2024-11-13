/*
    Exercise 9
    Directory: w46/e09
    Objective:
        - Write a program to record the time at which the user presses "Enter" 
            to start and then again to stop, calculating the elapsed time in seconds.
    Expected Output:
        - "Elapsed time: [X] seconds".
*/

import java.time.Instant;
import java.time.Duration;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Press Enter to start timing...");
        scanner.nextLine();
        Instant startTime = Instant.now();
        
        System.out.println("Press Enter to stop timing...");
        scanner.nextLine();
        Instant endTime = Instant.now();
        
        Duration elapsed = Duration.between(startTime, endTime);
        long seconds = elapsed.getSeconds();
        
        System.out.println("Elapsed time: " + seconds + " seconds");
        
        scanner.close();
    }
}
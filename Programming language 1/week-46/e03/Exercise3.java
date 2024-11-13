/*
    Exercise 3
    Directory: w46/e03
    Objective:
        - Write a program that takes two times as input and calculates the 
            difference in hours and minutes between them.
    Expected Output:
        - "Time difference: [X] hours and [Y] minutes".
*/
import java.time.LocalTime;
import java.time.Duration;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");

        try {
            System.out.print("Enter first time (HH:mm): ");
            String time1Str = scanner.nextLine();
            LocalTime time1 = LocalTime.parse(time1Str, formatter);

            System.out.print("Enter second time (HH:mm): ");
            String time2Str = scanner.nextLine();
            LocalTime time2 = LocalTime.parse(time2Str, formatter);

            Duration duration = Duration.between(time1, time2);
            if (duration.isNegative()) {
                duration = duration.plusHours(24);
            }

            long hours = duration.toHours();
            long minutes = duration.toMinutesPart();

            System.out.printf("Time difference: %d hours and %d minutes%n", hours, minutes);

        } catch (Exception e) {
            System.out.println("Invalid time format. Please use HH:mm format (e.g., 14:30)");
        } finally {
            scanner.close();
        }
    }
}
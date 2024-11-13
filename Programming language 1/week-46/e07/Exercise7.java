/*
    Exercise 7
    Directory: w46/e07
    Objective:
        - Write a program that takes a future event date and calculates the 
            remaining time in days, hours, and minutes.
    Expected Output: 
        - "Time until the event: [X] days, [Y] hours, and [Z] minutes".
*/
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        try {

            System.out.print("Enter event date and time (YYYY-MM-DD HH:mm): ");
            String eventDateStr = scanner.nextLine();
            LocalDateTime eventDate = LocalDateTime.parse(eventDateStr, formatter);
            LocalDateTime now = LocalDateTime.now();

            if (eventDate.isBefore(now)) {
                System.out.println("Event date must be in the future!");
                return;
            }

            long totalMinutes = ChronoUnit.MINUTES.between(now, eventDate);
            long days = totalMinutes / (24 * 60);
            long hours = (totalMinutes % (24 * 60)) / 60;
            long minutes = totalMinutes % 60;

            System.out.printf("Time until the event: %d days, %d hours, and %d minutes%n",
                            days, hours, minutes);

        } catch (Exception e) {
            System.out.println("Invalid format. Please use YYYY-MM-DD HH:mm (e.g., 2024-12-31 23:59)");
        } finally {
            scanner.close();
        }
    }
}
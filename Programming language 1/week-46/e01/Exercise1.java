/*
    Exercise 1
    Directory: w46/e01
    Objective:
        - Write a program to display the current date, time, and date-time 
            in the system’s default timezone.
    Expected Output:
        - Print the current date, time, and date-time in the format:
                    Current Date: YYYY-MM-DD  
                    Current Time: HH:MM:SS  
                    Current Date-Time: YYYY-MM-DDTHH:MM:SS  
*/
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise1 {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");

        System.out.println("Current Date: " + currentDateTime.format(dateFormatter));
        System.out.println("Current Time: " + currentDateTime.format(timeFormatter));
        System.out.println("Current Date-Time: " + currentDateTime.format(dateTimeFormatter));
    }
}
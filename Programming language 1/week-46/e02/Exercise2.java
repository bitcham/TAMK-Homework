/*
    Exercise 2
    Directory: w46/e02
    Objective: 
        - Create a program that takes a user-input number of days and calculates the date that many days from today.
    Expected Output:
        - Print the future date, e.g., "In [X] days, the date will be: YYYY-MM-DD".
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int days = scanner.nextInt();
        
        LocalDate today = LocalDate.now();
        LocalDate futureDate = today.plusDays(days);
        
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("In " + days + " days, the date will be: " + futureDate.format(dateFormatter));
        
        scanner.close();
    }
}
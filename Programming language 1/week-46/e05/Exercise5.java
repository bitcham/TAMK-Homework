/*
    Exercise 5
    Directory: w46/e05
    Objective:
        - Ask the user for their birthdate and calculate their age in years, months, and days.
    Expected Output:
        - "You are [X] years, [Y] months, and [Z] days old."
*/

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        try {
            System.out.print("Enter your birthdate (YYYY-MM-DD): ");
            String birthdateStr = scanner.nextLine();
            
            LocalDate birthdate = LocalDate.parse(birthdateStr, formatter);
            LocalDate currentDate = LocalDate.now();
            
            Period age = Period.between(birthdate, currentDate);
            
            System.out.printf("You are %d years, %d months, and %d days old.%n",
                age.getYears(), age.getMonths(), age.getDays());
                
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD format (e.g., 1990-01-31)");
        } finally {
            scanner.close();
        }
    }
}
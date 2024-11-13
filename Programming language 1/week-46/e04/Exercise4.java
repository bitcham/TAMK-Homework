/*
    Exercise 4
    Directory: w46/e04
    Objective:
        - Write a program that takes a date in YYYY-MM-DD format, formats it 
            to dd/MM/yyyy using DateTimeFormatter, and prints the result.
    Expected Output:
        - "Formatted Date: dd/MM/yyyy".
*/
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        try {
            System.out.print("Enter date (YYYY-MM-DD): ");
            String dateStr = scanner.nextLine();
            
            LocalDate date = LocalDate.parse(dateStr, inputFormatter);
            String formattedDate = date.format(outputFormatter);
            
            System.out.println("Formatted Date: " + formattedDate);
            
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD format (e.g., 2024-11-25)");
        } finally {
            scanner.close();
        }
    }
}
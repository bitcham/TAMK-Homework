/*
    Exercise 8
    Directory: w46/e08
    Objective:
        - Ask the user to input a start date and end date and calculate the 
            number of working days (Monday to Friday) between them.
    Expected Output:
        - "Total working days: [X]".
*/
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        try {
            System.out.print("Enter start date (YYYY-MM-DD): ");
            String startDateStr = scanner.nextLine();
            LocalDate startDate = LocalDate.parse(startDateStr, formatter);
            
            System.out.print("Enter end date (YYYY-MM-DD): ");
            String endDateStr = scanner.nextLine();
            LocalDate endDate = LocalDate.parse(endDateStr, formatter);
            
            if (endDate.isBefore(startDate)) {
                System.out.println("End date must be after start date!");
                return;
            }

            int workingDays = 0;
            LocalDate currentDate = startDate;
            
            while (!currentDate.isAfter(endDate)) {
                if (!isWeekend(currentDate)) {
                    workingDays++;
                }
                currentDate = currentDate.plusDays(1);
            }
            
            System.out.println("Total working days: " + workingDays);
            
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD format (e.g., 2024-01-01)");
        } finally {
            scanner.close();
        }
    }
    
    public static boolean isWeekend(LocalDate date) {
        DayOfWeek day = date.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }
}
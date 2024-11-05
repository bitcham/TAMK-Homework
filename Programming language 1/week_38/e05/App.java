import java.util.Scanner;

public class App {
    enum Day{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }

    public static void main(final String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a day by name : ");
        String user_input = scanner.nextLine().trim().toUpperCase();

        Day day = Day.valueOf(user_input);
        switch (day){
            case MONDAY:
                System.out.println("Start of the work week!");
                break;
            case TUESDAY:
                System.out.println("Only TUESDAYs");
                break;
            case WEDNESDAY:
                System.out.println("Good luck!");
                break;
            case THURSDAY:
                System.out.println("One more to go.");
                break;
            case FRIDAY:
                System.out.println("The last day of the work week.");
                break;
            case SATURDAY:
                System.out.println("Enjoy the weekend!");
                break;
            case SUNDAY:
                System.out.println("Enjoy the weekend!");
                break;
            default:
                System.out.println("Unknown day");
        }
        
        scanner.close();
        
    }
}

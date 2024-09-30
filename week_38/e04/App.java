import java.util.Scanner;

public class App {
    enum Day{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
    }

    public static void main(final String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number (1-7) : ");
        int number = scanner.nextInt();
        if (!((number >= 1)&&(number <= 7)))
            System.out.println("Wrong input.");
        else
        {   
            Day day = Day.values()[number - 1];
            switch (day){
                case Monday:
                    System.out.println("Today is Monday.");
                    break;
                case Tuesday:
                    System.out.println("Today is Tuesday.");
                    break;
                case Wednesday:
                    System.out.println("Today is Wednesday.");
                    break;
                case Thursday:
                    System.out.println("Today is thursday.");
                    break;
                case Friday:
                    System.out.println("Today is Friday.");
                    break;
                case Saturday:
                    System.out.println("Today is Saturday.");
                    break;
                case Sunday:
                    System.out.println("Today is Sunday.");
                    break;
                default:
                    System.out.println("Unknown day");
            }
        } 
        scanner.close();
        
    }
}

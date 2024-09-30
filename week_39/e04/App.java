import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE 
        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while(true)
        {
            System.out.println("Enter a number (0 to quit): ");
            input = scanner.nextInt();
            if (input == 0)
            {
                System.out.println("End.");
                break;
            }

            if (input % 2 == 0)
                System.out.println("Even number");
            if (input % 2 == 1)
                System.out.println("Odd number");
        }
        scanner.close();
    }
}
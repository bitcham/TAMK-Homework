import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE 
        System.out.print("Which multiplication table to show? ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();

        for (int i = 0; i < 11; i++)
            System.out.printf("%d x %d = %d", input, i, input * i).println();
        
    }
}
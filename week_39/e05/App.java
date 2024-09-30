import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
       Scanner scanner = new Scanner(System.in);
       float input = 0.0f;
       float sum = 0.0f;
       float average = 0.0f;
       int count = 0;

       while(true)
       {
        System.out.println("Give a test score (-1 to quit): ");
        input = scanner.nextFloat();
        
        if (input == -1) break;
        else
        {
            count++;
            sum += input;
            average = sum / count;
        }

        System.out.printf("Averages: %.1f", average).println();
        
       }
       scanner.close();
       System.out.println("Summary");
       System.out.println("------");
       System.out.printf("Tests: %d", count).println();
       System.out.printf("Averages: %.1f", average).println();
    }
}
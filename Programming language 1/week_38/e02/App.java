import java.util.Scanner;

public class App {
    public static void main(final String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a test score between 0 and 100.");

        int score = scanner.nextInt();

        if (score >= 90)
            System.out.println("Excellent!");
        else if (score >= 70)
            System.out.println("Good Job!");
        else if (score >= 50)
            System.out.println("Needs Improvement.");
        else
            System.out.println("Fail.");
            

        scanner.close();
        
    }
}

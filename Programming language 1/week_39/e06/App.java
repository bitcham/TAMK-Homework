import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE 
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int ran_num = rand.nextInt(11);
        int guess = -1;

        while(ran_num != guess)
        {
            System.out.print("Guess a number between 0 and 10 : ");
            guess = scanner.nextInt();
            if (ran_num < guess)
                System.out.println("Guess was high");
            if (ran_num > guess)
                System.out.println("Guess was low");
        }
        System.out.println("SUCCESS !");
        scanner.close();
    }
}
import java.util.Scanner;

public class App {
    public static void main(final String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Is it a weekend? Y/N");
        String weekend = scanner.nextLine();
        
        if (((age < 18) || (age > 65)) && (weekend.equalsIgnoreCase("Y")))
            System.out.println("You can get a discounted movie ticket.");
        else
            System.out.println("You can't get a discount.");
            

        scanner.close();
        
    }
}

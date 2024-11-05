import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            if (name.equals("Quit")){
                break;
            }
            System.out.println(name);
        }        
        scanner.close();
    }
}
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The password must meet the following requirements: ");
        System.out.println("- The password must be at least 8 characters long.");
        System.out.println(
                        "- It must contain at least:\n" +
                        "    - One uppercase letter (A-Z)\n" +
                        "    - One lowercase letter (a-z)\n" +
                        "    - One digit (0-9)");
        

        while(true){
            boolean hasUpperCase = false;
            boolean hasLowerCase = false;
            boolean hasDigit = false;

            System.out.println("Creat a new password: ");
            String input = scanner.nextLine();
            System.out.println("Input: " + input);

            if (input.length() >= 8){

                for (int i = 0; i < input.length(); i++) {
                    if (Character.isUpperCase(input.charAt(i))) {
                        hasUpperCase = true;
                    } else if (Character.isLowerCase(input.charAt(i))) {
                        hasLowerCase = true;
                    } else if (Character.isDigit(input.charAt(i))) {
                        hasDigit = true;
                    }
                }

                if (hasUpperCase && hasLowerCase && hasDigit) {
                    System.out.println("Output: Password is valid.");
                    break;
                }
                else {
                    System.out.print("Output: Password is invalid.");
                    if (!hasUpperCase) {
                        System.out.print(" Needs to include at least one uppercase letter.");
                    }
                    if (!hasLowerCase) {
                        System.out.print(" Needs to include at least one lowercase letter.");
                    }
                    if (!hasDigit) {
                        System.out.print(" Needs to include at least one digit.");
                    }
                    System.out.println();
                }
            }
            else{
                System.out.println("Output: Password is invalid. Needs to be at least 8 characters long.");
            }
        }
       
        scanner.close();
    }
}
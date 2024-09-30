import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // a. question
        System.out.println("Palindrome test, please enter some text: ");
        String text_a = scanner.nextLine();

        String lowerText_a = text_a.toLowerCase();
        String lowerReverseText_a = "";
    
        for (int i = text_a.length() - 1; i >= 0; i--)
        {
            lowerReverseText_a += lowerText_a.charAt(i);
        }
        if (lowerReverseText_a.equals(lowerText_a)){
            System.out.println(text_a + " is a palindrom.");
        } else{
            System.out.println(text_a + " is not a palindrom.");
        }
        
        // b. question
        
        System.out.println("Palindrome test, please enter some text: ");
        String text_b = scanner.nextLine();

        String cleanedLowerText_b =  text_b.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String lowerReverseText_b = "";
    
        for (int i = cleanedLowerText_b.length() - 1; i >= 0; i--)
        {
            lowerReverseText_b += cleanedLowerText_b.charAt(i);
        }
        if (lowerReverseText_b .equals(cleanedLowerText_b)){
            System.out.println(text_b + " is a palindrom.");
        } else{
            System.out.println(text_b + " is not a palindrom.");
        }
        scanner.close();
    }
}
package ex4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ex4Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Would you like to generate a lotto coupon? (y/n): ");
        String answer = scanner.nextLine();

        if (answer.toLowerCase().startsWith("y")) {
            System.out.print("How many lines would you like to generate? ");
            int numLines = scanner.nextInt();
            try {
                numLines = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
            }

            createLottoCoupon(numLines);
        } else {
            System.out.println("Program terminated.");
        }
        scanner.close();
    }

    private static void createLottoCoupon(int numLines) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("coupon.txt"))) {
            for (int line = 1; line <= numLines; line++) {
                List<Integer> numbers = generateLottoNumbers();
                
                writer.write("Line " + line + ":\n");
                writer.write(formatNumbers(numbers) + "\n\n");
                
                System.out.println("Line " + line + ":");
                System.out.println(formatNumbers(numbers) + "\n");
            }
            System.out.println("Coupon has been saved to coupon.txt");
            
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file: " + e.getMessage());
        }
    }

    private static List<Integer> generateLottoNumbers() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        while (numbers.size() < 7) {
            int num = random.nextInt(40) + 1;
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }
        
        Collections.sort(numbers);
        return numbers;
    }

    private static String formatNumbers(List<Integer> numbers) {
        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(String.format("%d ", num));
        }
        return sb.toString().trim();
    }
}
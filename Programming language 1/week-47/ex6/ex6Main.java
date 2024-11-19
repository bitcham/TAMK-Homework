package ex6;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class ex6Main {
    private static List<List<Integer>> allGeneratedNumbers = new ArrayList<>();
    private static final String CSV_FILE = "lotto.csv";
    private static final String COUPON_FILE = "coupon.txt";
    private static final double COST_PER_LINE = 2.0;

    public static void main(String[] args) {
        loadExistingNumbers();
        runMenu();
    }

    private static void loadExistingNumbers() {
        allGeneratedNumbers.clear();
        try {
            if (Files.exists(Paths.get(CSV_FILE))) {
                List<String> lines = Files.readAllLines(Paths.get(CSV_FILE));
                for (String line : lines) {
                    List<Integer> numbers = new ArrayList<>();
                    String[] parts = line.split(",");
                    for (String part : parts) {
                        numbers.add(Integer.parseInt(part.trim()));
                    }
                    allGeneratedNumbers.add(numbers);
                }
                System.out.println("Loaded existing numbers from " + CSV_FILE);
            }
        } catch (IOException e) {
            System.out.println("Error loading existing numbers: " + e.getMessage());
        }
    }

    private static void runMenu() {
        Scanner scanner = new Scanner(System.in);
        String choice;

        do {
            displayCurrentLines();
            System.out.println("\nN = Generate new coupon");
            System.out.println("P = Print coupon");
            System.out.println("Q = Quit");
            System.out.print("Choice: ");
            
            choice = scanner.nextLine().toUpperCase();
            
            switch (choice) {
                case "N":
                    generateNewCoupon(scanner);
                    break;
                case "P":
                    printCoupon();
                    break;
                case "Q":
                    saveAndQuit();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (!choice.equals("Q"));
        
        scanner.close();
    }

    private static void displayCurrentLines() {
        System.out.println("\nCurrent Lines:");
        if (allGeneratedNumbers.isEmpty()) {
            System.out.println("No lines generated yet.");
        } else {
            for (List<Integer> numbers : allGeneratedNumbers) {
                System.out.println(formatNumbers(numbers));
            }
        }
    }

    private static void generateNewCoupon(Scanner scanner) {
        System.out.print("How many lines would you like to generate? (minimum 1): ");
        int numLines;
        try {
            numLines = Integer.parseInt(scanner.nextLine());
            if (numLines < 1) {
                System.out.println("Number of lines must be at least 1.");
                return;
            }
            
            double totalCost = numLines * COST_PER_LINE;
            System.out.printf("Total cost will be $%.1f. Continue? (y/n): ", totalCost);
            String confirm = scanner.nextLine().toLowerCase();
            
            if (confirm.equals("y")) {
                allGeneratedNumbers.clear(); 
                for (int i = 0; i < numLines; i++) {
                    allGeneratedNumbers.add(generateLottoNumbers());
                }
                saveToBothFormats();
                System.out.println("New coupon generated successfully!");
            } else {
                System.out.println("Coupon generation cancelled.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
    }

    private static void printCoupon() {
        if (allGeneratedNumbers.isEmpty()) {
            System.out.println("No lines to print. Generate a coupon first.");
            return;
        }

        System.out.println("\nPrinting coupon...");
        System.out.println("----------------------------------------");
        for (int i = 0; i < allGeneratedNumbers.size(); i++) {
            System.out.println("Line " + (i + 1) + ":");
            System.out.println(formatNumbers(allGeneratedNumbers.get(i)));
            System.out.println();
        }
        System.out.println("----------------------------------------");
    }

    private static void saveToBothFormats() {
        saveToCSV();
        saveToFormattedText();
    }

    private static void saveToCSV() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE))) {
            for (List<Integer> line : allGeneratedNumbers) {
                String csvLine = line.stream()
                        .map(String::valueOf)
                        .reduce((a, b) -> a + "," + b)
                        .orElse("");
                writer.write(csvLine + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving to CSV: " + e.getMessage());
        }
    }

    private static void saveToFormattedText() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(COUPON_FILE))) {
            for (int i = 0; i < allGeneratedNumbers.size(); i++) {
                writer.write("Line " + (i + 1) + ":\n");
                writer.write(formatNumbers(allGeneratedNumbers.get(i)) + "\n\n");
            }
        } catch (IOException e) {
            System.out.println("Error saving formatted text: " + e.getMessage());
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

    private static void saveAndQuit() {
        saveToBothFormats();
        System.out.println("Numbers saved. Program terminated.");
    }
}
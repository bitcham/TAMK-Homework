/*
    Exercise 6 
    Directory: w41/e06
    Objective:
        - Write a Java program to read a file (temperatures.txt) containing daily temperature data (in Celsius) into an array.
        - Calculate the average temperature, find the maximum and minimum temperatures-
        - Write the results to an output file (result.txt).
    Expected Output:
                Average Temperature: [average]
                Maximum Temperature: [max]
                Minimum Temperature: [min]
*/

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
         double[] numbers = {
            15.5,
            22.7,
            19.8,
            10.0,
            17.5};
        String fileName = "temperature.txt";

        try (FileWriter writer = new FileWriter(fileName, false)) { 
            for (int i = 0; i < numbers.length; i++) {
                writer.write(String.valueOf(numbers[i]));
                if (i < numbers.length - 1) {
                    writer.write(", ");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        double max = numbers[0];
        double min = numbers[0];
        double sum = 0;
        for (int i = 0; i < numbers.length; i++){
            max = Math.max(max, numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++){
            min = Math.min(min, numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++){
            sum += numbers[i];
        }
        double average = sum / numbers.length;

        String fileName2 = "result.txt";

        try (FileWriter writer = new FileWriter(fileName2, false)) { 
            writer.write("Average Temperature: " + String.valueOf(average) + "\n");
            writer.write("Maximum Temperature: " + String.valueOf(max) + "\n");
            writer.write("Minimum Temperature: " + String.valueOf(min) + "\n");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }
}
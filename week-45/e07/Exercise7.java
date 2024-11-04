/*
    Exercise 7
    Directory: w45/e07
    Objective:
        - Create a 2D array where rows represent days of the week and columns 
            represent temperature readings for different times of the day. 
            Calculate and print the average temperature for each day.
        - Use Math.random() to generate the temperature values
    Expected Output:
        - For each day, print the average temperature, e.g., "Monday average temperature: 22.5".
*/

import java.time.DayOfWeek;
public class Exercise7 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        double[][] arr = new double[7][24];
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = Math.random() * 50;
                sum += arr[i][j];
            }
            System.out.printf("%s average temperature: %.1f\n", DayOfWeek.of(i + 1), sum / arr[i].length);
            sum = 0;
        }
    }
}
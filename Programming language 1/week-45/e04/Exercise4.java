/*
    Exercise 4
    Directory: w45/e04
    Objective:
        - Create a 2D array where each row represents a student and each column represents their test scores (5 tests). 
            Calculate and print the average score for each student.
    Expected Output:
        - For each student, print scores and average, e.g., "Student 1 scores: 70, 80, 90, 85, 75 | Average: 80".
*/

public class Exercise4 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE 
        double[][] arr = {
            {70, 80, 90, 85, 75},
            {60, 70, 80, 80, 75}
        };
        double sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
            System.out.println((i + 1) + " student's average score is " + sum / arr[i].length);
            sum = 0;
        }
    }
}
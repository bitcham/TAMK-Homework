/*
    Exercise 3
    Directory: w45/e03
    Objective:
        - Create a 4x4 2D array with integer values. 
            Calculate and print the sum of the main diagonal (top-left to bottom-right).
    Expected Output:
        - "The sum of the main diagonal is: [sum of diagonal values]".
*/

public class Exercise3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i][i];
        }
        System.out.println(sum);
    }
}
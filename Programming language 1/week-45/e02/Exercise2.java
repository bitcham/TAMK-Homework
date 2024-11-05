/*
    Exercise 2
    Directory: w45/e02
    Objective: 
        - Create a 3x3 2D array filled with integers. 
            Write methods to calculate the sum of each row and each column.
    Expected Output:
        - Print each row and column sum, e.g., "Sum of row 1: 15" and "Sum of column 1: 12".
*/

public class Exercise2 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for(int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for(int j = 0; j < arr[i].length; j++) {
                rowSum += arr[i][j];
            }
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }  
    }
}
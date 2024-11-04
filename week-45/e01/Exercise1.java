/*
    Exercise 1
    Directory: w45/e01
    Objective:
        - Create a 3x3 2D array with integers from 1 to 9 and print the array in matrix form.
    Expected Output:
        1 2 3  
        4 5 6  
        7 8 9  
*/

public class Exercise1 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
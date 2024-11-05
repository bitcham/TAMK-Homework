/*
    Exercise 6 
    Directory: w45/e06
    Objective:
        - Create a 3x3 2D array with random integer values and find the maximum element in each row.
    Expected Output:
        - For each row, print the maximum value, e.g., "Max in row 1: 9".
        - Use Math.random() to generate the values
*/

public class Exercise6 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        int[][] arr = new int[3][3];
        for(int i = 0; i < arr.length; i++){
            int max = 0;
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random() * 10);
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
            System.out.println("Max in row " + (i + 1) + ": " + max);
        } 
    }
}
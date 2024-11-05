/*
    Exercise 5
    Directory: w45/e05
    Objective:
        - Create a 2D array representing a matrix and write a program to transpose it (swap rows and columns).
    Expected Output:
        - Print the original and transposed matrix. 
        - Use Math.random() to generate the values
*/

public class Exercise5 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        int[][] arr = new int[3][3];
        int[][] transposed = new int[3][3];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                arr[i][j] = (int)(Math.random() * 10);
                transposed[j][i] = arr[i][j];
            }
        }
        System.out.println("Original matrix:");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Transposed matrix:");
        for(int i = 0; i < transposed.length; i++){
            for(int j = 0; j < transposed[i].length; j++){
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
    Exercise 9
    Directory: w45/e09
    Objective:
        - Create a 2D array representing a simulation grid for simple life forms, 
            where 1 is an alive cell and 0 is a dead cell. 
        - Implement the rules of Conway’s Game of Life and simulate it for 6 iterations.
        - https://simple.wikipedia.org/wiki/Conway%27s_Game_of_Life
    Expected Output: 
        - Print the grid after each iteration, showing how cells evolve based on the rules.
*/

public class Exercise9 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        int rows = 10;
        int cols = 10;
        int[][] grid = new int[rows][cols];
        int[][] newGrid = new int[rows][cols];
        
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                grid[i][j] = (int)(Math.random() * 2);
            }
        }
        
        System.out.println("Initial grid:");
        printGrid(grid);
        
        for(int k = 0; k < 6; k++){
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[i].length; j++){
                    int aliveNeighbors = countAlive(grid, i, j);
                    if(grid[i][j] == 1){
                        if(aliveNeighbors < 2 || aliveNeighbors > 3){
                            newGrid[i][j] = 0;
                        } else {
                            newGrid[i][j] = 1;
                        }
                    } else {
                        if(aliveNeighbors == 3){
                            newGrid[i][j] = 1;
                        } else {
                            newGrid[i][j] = 0;
                        }
                    }
                }
            }
            
            for(int i = 0; i < grid.length; i++){
                for(int j = 0; j < grid[i].length; j++){
                    grid[i][j] = newGrid[i][j];
                }
            }
            
            System.out.println("Grid after iteration " + (k + 1) + ":");
            printGrid(grid);
        }
    }

    public static void printGrid(int[][] grid){
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int countAlive(int[][] grid, int row, int col){
        int count = 0;
        int[] rowSets = {-1, -1, -1, 0, 0, 1, 1, 1};
        int[] colSets = {-1, 0, 1, -1, 1, -1, 0, 1};
        for(int i = 0; i < rowSets.length; i++){
            int newRow = row + rowSets[i];
            int newCol = col + colSets[i];
            if(newRow >= 0 && newRow < grid.length && newCol >= 0 && newCol < grid[0].length){
                if(grid[newRow][newCol] == 1){
                    count++;
                }
            }
        }
        return count;
    }
}
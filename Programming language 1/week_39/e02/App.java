public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE 
        int row = 4;

        for (int r = 0; r < row; r++)
        {
            for (int i = 0; i < row - r - 1; i++)
                System.out.printf(" ");

            for (int j = 0; j < r*2 + 1;j++)
                System.out.printf("*");

            System.out.println();
        }
    }
}
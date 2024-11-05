/*
    Exercise 6 
    Directory: w44/e06
    Objective:
        - Write overloaded methods called power that:
          - Accepts two integers and returns the first number raised to the power of the second.
          - Accepts two doubles and returns the first number raised to the power of the second.
    Expected Output:
          - Print results of both methods, such as “2^3 = 8” and “2.5^3.5 ≈ 24.705”.
*/

public class Exercise6 {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        power(2, 3);
        power(2.5, 3.5);
    }

    public static void power(int a, int b) {
        // YOUR CODE GOES HERE
        double result = Math.pow(a, b);
        System.out.printf("%d^%d = %.0f\n", a, b, result);
    }

    public static void power(double a, double b) {
        // YOUR CODE GOES HERE
        double result = Math.pow(a, b);
        result = Math.round(result * 1000.0) / 1000.0;
        System.out.println(a + "^" + b + " = " + result);
    }

}
/*
    Exercise 8
    Directory: w44/e08
    Objective:
        - Create a class Calculator with a public method addAndDisplay that 
            takes two integers. Inside this method, call a private helper method 
            calculateSum to perform the addition and return the result.
    Expected Output:
        - Display the sum, e.g., “The sum is: 25” for inputs 10 and 15. 
            Ensure that calculateSum is only accessible within Calculator.
*/

public class Exercise8 {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Calculator calculator = new Calculator();
        calculator.addAndDisplay(10, 15); 
    }
}
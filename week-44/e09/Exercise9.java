/*
    Exercise 9
    Directory: w44/e09
    Objective:
        - Create a Parent class with a protected method showMessage. 
            Create a Child class that inherits from Parent and 
            calls showMessage in its own method.
    Expected Output:
        - Print a message when Child calls showMessage, e.g., “Message from Parent class”.
*/

class Exercise9 {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Child child = new Child();
        child.displayMessage();
    }
}
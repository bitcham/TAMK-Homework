/*
    Exercise 2
    Directory: w43/e02
    Objective: 
        - Change the code that the printJavaMethods() method prints Java Methodsand the printGreeting() method prints Hello. 
        - Call both the methods from the main method to display the greeting.
    Expected Output:
                Hello Java Methods
*/

class Exercise2 {
    public static void main(String [] args) {
        // YOUR CODE GOES HERE
        printGreeting();
        printJavaMethods();
    }

    public static void printGreeting() {
        System.out.print("Hello ");  
    }

    public static void printJavaMethods() {
        // YOUR CODE GOES HERE
        System.out.print("Java Methods "); 
    }
}
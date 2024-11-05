/*
    Exercise 7
    Directory: w44/e07
    Objective:
        - Create a Demo class with methods marked as public, protected, private, 
            and no modifier. Call each method from a Main class in the same package.
        - NOTE: For exercises 7-9, because we have multiple files, 
                running the code with the command "java Exercise7.java"
                wont work. Use the commands listed below:
                - javac Demo.java Exercise7.java
                - java Exercise7 # WithOUT ".java" ending
    Expected Output: 
        - Only the public, protected, and package-private methods should be 
            accessible from Main. Calling the private method should produce a compile error.

*/


class Exercise7 {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        Demo demo = new Demo();
        demo.protectedMethod();
        demo.packagePrivateMethod();
        System.out.println(demo.multiply(3 ,5));
        System.out.println(demo.privateAdd(3 ,5)); //compile error.
    }
}
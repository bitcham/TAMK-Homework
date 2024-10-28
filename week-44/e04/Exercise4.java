/*
    Exercise 4
    Directory: w44/e04
    Objective:
        - Write a program with an overloaded method calculateArea that computes the area for:
          - A rectangle (2 parameters: length and width).
          - A square (1 parameter: side length).
    Expected Output:
        - Print the area of each shape, e.g., "Area of rectangle: 20" and "Area of square: 16"
*/


class Exercise4 {
    public static void main(String [] args) {
        // YOUR CODE GOES HERE 
        calculateArea(4,5);
        calculateArea(4);
    }

    public static void calculateArea(int length, int width) {
        // YOUR CODE GOES HERE 
        System.out.printf("Area of rectangle: %d\n", length * width);
    }

    public static void calculateArea(int side) {
        // YOUR CODE GOES HERE
        System.out.printf("Area of rectangle: %d\n", side * side); 
    }
}
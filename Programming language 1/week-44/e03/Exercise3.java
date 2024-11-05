/*
    Exercise 3
    Directory: w44/e03
    Objective:
        - Write a method called convertToCelsius that accepts a temperature in 
            Fahrenheit and returns the equivalent temperature in Celsius.
    Expected Output:
        - Print the Celsius equivalent of a Fahrenheit temperature, 
            e.g., “50°F in Celsius is 10°C” for input 50.
*/

class Exercise3 {
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        convertToCelsius(50);
    }

    public static void convertToCelsius(double temperature) {
        // YOUR CODE GOES HERE
        System.out.printf("%.0f°F in Celsius is %.0f°C", temperature, ((temperature - 32) * 5 / 9));
    }
}
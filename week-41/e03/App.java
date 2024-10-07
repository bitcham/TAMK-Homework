/*
    Exercise 3
    Directory: w41/e03
    Objective:
        - Write a program that uses a String array to store 5 names. 
        - Use the names Julianne, Brandon, Cesar, Johnathan, Carmen and Ariel. 
        - Use a for loop to display only every second name.
    Expected Output:
                Brandon 
                Johnathan
                Ariel
*/

public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        String[] strings = {"Julianne", "Brandon", "Cesar", "Johnathan", "Carmen", "Ariel"};
        int n = strings.length;
        
        for(int i = 1; i < n; i += 2){
            System.out.println(strings[i]);
        }
    }
}
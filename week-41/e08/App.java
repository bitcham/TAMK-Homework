/*
    Exercise 8 
    Directory: w41/e06
    Objective:
        - Write a program that generates 10 random integers between 1 and 100 and store it to an array (use `Math.random()` for generating the integers). 
        - The user enter their guess as a command line argument. The application tells the user if the guessed number is in the array.
    Expected Output:
                java App 50
                Found!

                java App 42
                Not found!
*/


public class App {
    public static void main(final String[] args) {
        // YOUR CODE GOES HERE
        int[] number = new int[10];
        
        for(int i = 0; i < 10; i++){
            number[i] = (int)(Math.random() * 100) + 1;
            System.out.println(number[i]);//Check what are the numbers
        }
        
        int guess = Integer.parseInt(args[0]);

        boolean found = false;
        for(int i = 0; i < 10; i++){
            if(guess == number[i]){
                found = true;
                break;
            }
        }

        if (found){
            System.out.println("Found !");
        }else{
            System.out.println("Not Found !");
        }


    }
}
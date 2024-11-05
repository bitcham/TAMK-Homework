/*
    Exercise 7
    Directory: w41/e07
    Objective:
    Expected Output: 
*/

public class App {
    public static void main(String [] args) {
        //System.out.println(args[0]);
        //System.out.println(args[1]);
        double number1 = Double.parseDouble(args[0]);
        double number2 = Double.parseDouble(args[2]);
        String operator = args[1];

        if(operator.equals("+")){
            System.out.println(number1 + number2);
        }else if(operator.equals("-")){
            System.out.println(number1 - number2);
        }else if(operator.equals("*")){
            System.out.println(number1 * number2);
        }else if(operator.equals("/")){
            System.out.println(number1 / number2);
        }

    }
}
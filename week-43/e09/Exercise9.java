/*
    Exercise 9
    Directory: w43/e09
    Objective:
        - Fix the code so that it will display the sum. 
        - Remember to use static when declaring the variable.
    Dont change:
        - All the methods return nothing, void methods
        - All the methods accepts no arguments.
    Expected Output:
                10
*/

class Exercise9 {

    static int a, b, sum;
    public static void main(String [] args) {
        setA();
        setB();
        calculateSum();
        print();
    }

    public static void setA() {
        a = 5;
    }

    public static void setB() {
        b = 5;
    }

    public static void calculateSum() {
        sum = a + b;
    }

    public static void print() {
        System.out.println(sum);
    }

}
public class Calculator {
        // YOUR CODE GOES HERE
        private int calculateSum(int a, int b) {
                return a + b;
        }
            
        
        public void addAndDisplay(int a, int b) {
                int sum = calculateSum(a, b);
                System.out.println("The sum is: " + sum);
        }
}

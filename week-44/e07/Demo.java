public class Demo {
        // YOUR CODE GOES HERE
        private int privateAdd(int a, int b){
                return a + b;
        }
        
        public int multiply(int a, int b){
                return a * b;
        }

        void packagePrivateMethod() {
                System.out.println("This is a package-private method.");
        }

        protected void protectedMethod() {
                System.out.println("This is a protected method.");
        }
}


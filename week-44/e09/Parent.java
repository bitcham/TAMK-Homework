public class Parent {
        protected void showMessage() {
            System.out.println("Message from Parent class");
        }
}
    
class Child extends Parent {
        public void displayMessage() {
            showMessage(); 
        }
}
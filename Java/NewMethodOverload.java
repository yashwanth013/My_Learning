package Java;

public class NewMethodOverload {
    public class DisplayOverload {

        // Method to display an integer
        public void display(int number) {
            System.out.println("Displaying integer: " + number);
        }

        // Method to display a double
        public void display(double number) {
            System.out.println("Displaying double: " + number);
        }

        // Method to display a string
        public void display(String text) {
            System.out.println("Displaying string: " + text);
        }

        public static void main(String[] args) {
            DisplayOverload display = new NewMethodOverload().new DisplayOverload();

            display.display(10);
            display.display(10.5);
            display.display("Hello, World!");
        }
    }
}
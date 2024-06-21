package Java;

public class MethodOverride {
    public void message() {
        System.out.println("I feel like I am diagonally parked in a parallel universe.");
    }

    public class Advice extends MethodOverride {
        @Override // @Override annotation in Java 5 is optional but helpful.

        public void message() {
            System.out.println("Warning: Dates in calendar are closer than they appear.");
        }
    }

    public class ShapeAreaCalculator {

        // Method to calculate the area of a rectangle
        public double calculateArea(double length, double width) {
            return length * width;
        }

        // Method to calculate the area of a circle
        public double calculateArea(double radius) {
            return Math.PI * radius * radius;
        }

        // Method to calculate the area of a triangle
        public double calculateArea(double base, double height, boolean isTriangle) {
            if (isTriangle) {
                return 0.5 * base * height;
            }
            return -1; // Invalid call
        }

        public static void main(String[] args) {
            MethodOverride parking = new MethodOverride();
            parking.message();
            MethodOverride advice = new MethodOverride().new Advice(); // Polymorphism
            advice.message();

            ShapeAreaCalculator calculator = new MethodOverride().new ShapeAreaCalculator();

            double rectangleArea = calculator.calculateArea(5.0, 3.0);
            System.out.println("Rectangle Area: " + rectangleArea);

            double circleArea = calculator.calculateArea(4.0);
            System.out.println("Circle Area: " + circleArea);

            double triangleArea = calculator.calculateArea(5.0, 4.0, true);
            System.out.println("Triangle Area: " + triangleArea);
        }

    }
}

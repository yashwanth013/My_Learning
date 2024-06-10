package Java;

public class Arrays {

    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        System.out.println(cars.length);
        System.out.println(cars[0]);

        for (int i = 0; i <= cars.length - 1; i++) {
            System.out.println(cars[i]);
        }

        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

        float avg, sum = 0;
        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;

        System.out.println("The average age is: " + avg);

    }

}
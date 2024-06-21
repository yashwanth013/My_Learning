package Java;

import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many numbers they want to input
        System.out.print("Enter the number of elements you want to store: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] numbers = new int[n];

        // Take inputs from the user and store them in the array
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Ask if the user wants the maximum value
        System.out.print("Do you want to find the maximum value? (yes/no): ");
        String response = scanner.next();

        if (response.equalsIgnoreCase("yes")) {
            // Find the maximum value in the array
            int max = numbers[0];
            for (int i = 1; i < n; i++) {
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }
            // Print the maximum value
            System.out.println("The maximum value in the array is: " + max);
        } else {
            System.out.println("No maximum value requested.");
        }

        // Close the scanner
        scanner.close();
    }
}

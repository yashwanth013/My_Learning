package Java;

import java.util.Scanner;

public class buu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        // Initialize the array
        int[] array = new int[n];

        // Read the elements of the array
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Perform Bubble Sort and count swaps
        BubbleSort1 bs = new BubbleSort1();
        int numSwaps = bs.bubbleSort(array);

        // Print the results
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + array[0]);
        System.out.println("Last Element: " + array[n - 1]);

        scanner.close();
    }

}

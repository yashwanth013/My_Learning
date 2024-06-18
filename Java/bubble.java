package Java;

import java.util.*;

public class bubble {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        @SuppressWarnings("resource")
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

        int l = array.length;
        @SuppressWarnings("unused")
        int numSwaps = 0;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    numSwaps += 1;
                }
            }
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

    }

}

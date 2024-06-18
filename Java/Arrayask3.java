package Java;

import java.util.*;

public class Arrayask3 {
    public static void main(String[] args) {
        int[] setNums = { 4, 25, 10, 7, 9, 4, 23, 47, 13, 5, 20, 21 };
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();

        for (int i = 0; i < setNums.length; i++) {
            if (setNums[i] == n) {
                System.out.println("Your number is match ");

            } else {
                int[] newArray = new int[setNums.length + 1];
                for (int j = 0; j < setNums.length; j++) {
                    newArray[j] = setNums[j];
                }
                newArray[setNums.length] = n; // Add the new number
                newArray[12] = n;
                newArray[13] = n;
                setNums = newArray; // Assign the new array to setNums

                System.out.println("Number added to the array.");
                break;

            }
        }
        System.out.print("Updated array: ");
        for (int num : setNums) {
            System.out.print(num + " ");
        }
    }
}

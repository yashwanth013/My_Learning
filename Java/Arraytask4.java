package Java;

import java.util.Scanner;

public class Arraytask4 {
    public static void main(String[] args) {
        int[] setNums = { 4, 25, 10, 7, 9, 4, 23, 47, 13, 5, 20, 21 };
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int newNum = scanner.nextInt();
        int count = 0;
        int[] newArray = new int[setNums.length - 1];

        for (int i = 0; i < setNums.length; i++) {

            if (setNums[i] == newNum) {

            } else {

                newArray[count] = setNums[i];

                count++;

            }

        }
        setNums = newArray;
        System.out.print("Updated array: ");
        for (int num : setNums) {
            System.out.print(num + " ");
        }
    }
}

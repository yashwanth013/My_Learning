package Java;

import java.util.*;

public class Arraystask {

    public static void main(String[] args) {
        int[] setNums = { 4, 25, 10, 7, 9, 4, 23, 47, 13, 5, 20, 21 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        boolean found = false;

        for (int i = 0; i < setNums.length; i++) {
            if (setNums[i] == n) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Your number is match ");
        } else {
            System.out.println("not found ");
        }

    }
}

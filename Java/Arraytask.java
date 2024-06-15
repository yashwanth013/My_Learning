package Java;

import java.util.Arrays;

public class Arraytask {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 4, 8, 1, 2, 5, 7, 3 };
        Arrays.sort(nums);
        System.out.println("Minimum : " + nums[0]);
        System.out.println("Minimum : " + nums[nums.length - 1]);

    }
}

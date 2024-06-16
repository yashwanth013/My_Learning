package Java;

public class Arraytask {
    public static void main(String[] args) {
        int[] nums = { 5, 6, 4, 8, 1, 2, 5, 7, 3 };
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];

            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (min > nums[i]) {
                min = nums[i];

            }
        }
        System.out.print(max);
        System.out.print(min);

    }
}

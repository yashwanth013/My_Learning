package Java;

public class BubbleSort1 {
    public int bubbleSort(int[] array) {
        int n = array.length;
        int numSwaps = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                // Swap adjacent elements if they are in decreasing order
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    numSwaps++;
                }
            }
        }

        return numSwaps;
    }
}

package Java;

public class pattern3 {
    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 5; i++) {
            int count = 1;
            for (j = 1; j <= i; j++) {

                System.out.print(count);
                count++;
            }

            System.out.println();
        }

    }
}

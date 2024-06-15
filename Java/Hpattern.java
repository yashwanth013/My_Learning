package Java;

public class Hpattern {

    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 5; i++) {
            if (i == 3) {
                for (j = 1; j <= 4; j++) {
                    if (j == 2 || j == 3) {
                        System.out.print("H");
                    } else {
                        System.out.print(" ");
                    }
                }

            } else {
                for (j = 1; j <= 4; j++) {
                    if (j == 2 || j == 3) {
                        System.out.print(" ");

                    } else {
                        System.out.print("H");
                    }

                }
            }

            System.out.println();
        }
    }
}

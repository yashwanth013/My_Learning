package Java;

public class Kpattern {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 5; i++) {

            if (i == 1 || i == 5) {
                for (j = 1; j <= 5; j++) {
                    if (j == 2 || j == 3 || j == 4) {
                        System.out.print(" ");
                    } else {
                        System.out.print("K");
                    }

                }
            } else if (i == 2 || i == 4) {
                for (j = 1; j <= 5; j++) {
                    if (j == 1 || j == 4) {
                        System.out.print("K");
                    } else {
                        System.out.print(" ");
                    }

                }

            } else {
                for (j = 1; j <= 5; j++) {
                    if (j == 2) {
                        System.out.print("K");
                    } else {
                        System.out.print(" ");
                    }

                }

            }

            System.out.println();
        }
    }
}

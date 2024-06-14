package Java;

public class Hpattern {

    public static void main(String[] args) {
        for (int row = 0; row < 5; row++) {
            for (int col = 0; col < 4; col++) {
                if ((row == 2 && col == 2) || (row == 2 && col == 1)) {
                    System.out.print("H");
                } else if (col == 1 || col == 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("H");
                }

            }
            System.out.println();
        }
    }
}
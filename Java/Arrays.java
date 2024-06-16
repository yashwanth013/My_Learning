package Java;

public class Arrays {

    public static void main(String[] args) {
        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };

        System.out.println(cars.length);
        System.out.println(cars[0]);

        for (int i = 0; i <= cars.length - 1; i++) {
            System.out.println(cars[i]);
        }

        int ages[] = { 20, 22, 18, 35, 48, 26, 87, 70 };

        float avg, sum = 0;
        int length = ages.length;

        for (int age : ages) {
            sum += age;
        }

        avg = sum / length;

        System.out.println("The average age is: " + avg);

        int[][] myNumbers = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        System.out.println(myNumbers[1][2]);
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]);

        int[][] myNumbers1 = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
        for (int i = 0; i < myNumbers1.length; ++i) {
            for (int j = 0; j < myNumbers1[i].length; ++j) {
                System.out.println(myNumbers1[i][j]);

                int[][] myNumbers2 = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
                for (int[] row : myNumbers2) {
                    for (int m : row) {
                        System.out.println(m);
                    }
                }

            }
        }
    }

    public static void sort(int[] nums) {

        throw new UnsupportedOperationException("Unimplemented method 'sort'");
    }

    public static char[] tostring(int[] setNums) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tostring'");
    }
}
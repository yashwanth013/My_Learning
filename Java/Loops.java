package Java;

public class Loops {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        int j = 0;
        do {
            System.out.println(j);
            j++;
        } while (j < 10);

        int count = 3;
        while (count > 0) {
            System.out.println(count);
            count--;

        }
        System.out.println("Happy New Year !");

        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("NO Yatzy.");
            } else {
                System.out.println("Yatzy ! ");
            }
            dice++;
        }

        for (i = 2; i <= 10; i = i + 2) {
            System.out.println(i);
        }

        for (int k = 1; k <= 2; k++) {
            System.out.println("Outer: " + k); // Executes 2 times

            // Inner loop
            for (int l = 1; l <= 3; l++) {
                System.out.println(" Inner: " + l); // Executes 6 times (2 * 3)
            }
        }

        String[] cars = { "Volvo", "BMW", "Ford", "Mazda" };
        for (String val : cars) {
            System.out.println(val);
        }

        for (int myNum = 0; myNum <= 100; myNum += 10) {
            System.out.println(myNum);
        }

        int number = 2;
        for (int mul = 1; mul <= 10; mul++) {
            System.out.println(number + " x " + mul + " = " + (number * mul));
        }

        for (int mem = 0; mem < 10; mem++) {
            if (mem == 4) {
                break;
            }
            System.out.println(mem);
        }

        for (int m = 0; m < 10; m++) {
            if (m == 4) {
                continue;
            }
            System.out.println(i);
        }

        int n = 0;
        while (n < 10) {
            System.out.println(n);
            n++;
            if (n == 4) {
                break;
            }
        }

        int p = 0;
        while (p < 10) {
            if (p == 4) {
                p++;
                continue;
            }
            System.out.println(p);
            p++;
        }
    }
}

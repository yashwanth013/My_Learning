package Java;

import java.util.Scanner;

public class ScoreLogic {
    static int sizeOover = 6;
    static int numofOver = 2;

    public int calculateScore(String teamName, Scanner scanner) {

        System.out.println("Enter the score of " + teamName);
        int totalscore = 0;
        int score = 0;
        for (int i = 0; i < numofOver; i++) {
            for (int j = 1; j <= sizeOover; j++) {

                if (j == 6) {

                    System.out.println("Enter score for " + (i + 1) + " over.");

                } else {
                    System.out.println("Enter score for " + i + "." + j + " over.");

                }

                score = scanner.nextInt();
                if (score > 6) {
                    System.out.println("Entered Invalid Runs. Please enter the runs Again !");
                    score = scanner.nextInt();
                }
                totalscore += score;
            }
            System.out.println("Total Score after " + (i + 1) + " over is : " + totalscore);
        }

        return totalscore;
    }
}

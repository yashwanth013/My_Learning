package Java;

import java.util.Scanner;

public class CricketScore {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ScoreLogic obj = new ScoreLogic();
        int totalscoreA = obj.calculateScore("TeamA", scanner);
        System.out.println("result of A " + totalscoreA);
        int totalscoreB = obj.calculateScore("TeamB", scanner);
        System.out.println("result of B " + totalscoreB);
        if (totalscoreA > totalscoreB) {
            System.out.println("Team A WINS The Game.");
        } else if (totalscoreA < totalscoreB) {
            System.out.println("Team B WINS The Game.");
        } else {
            System.out.println("The Match is Draw : Its Time for Super Over");
        }

        scanner.close();
    }
}

package Java;

public class CricketScore {

    public static void main(String[] args) {

        ScoreLogic obj = new ScoreLogic();
        int totalscoreA = obj.calculateScore("TeamA");
        System.out.println("result of A " + totalscoreA);
        int totalscoreB = obj.calculateScore("TeamB");
        System.out.println("result of A " + totalscoreB);
        if (totalscoreA > totalscoreB) {
            System.out.println("Team A WINS The Game.");
        } else if (totalscoreA < totalscoreB) {
            System.out.println("Team B WINS The Game.");
        } else {
            System.out.println("The Match is Draw : Its Time for Super Over");
        }
    }
}

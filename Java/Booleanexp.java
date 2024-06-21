package Java;

public class Booleanexp {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        System.out.println(x > y);
        boolean isjustfun = true;
        boolean nothavefun = false;
        System.out.println(isjustfun);
        System.out.println(nothavefun);

        // real life example person old enough to voe !
        int age = 25;
        int toVote = 18;
        System.out.println(age >= toVote);
        // with if else
        int myAge = 21;
        int votingAge = 18;
        if (myAge >= votingAge) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }
    }
}

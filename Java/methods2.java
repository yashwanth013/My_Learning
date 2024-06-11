package Java;

public class methods2 {
    static void checkAge(int age) {
        if (age < 18) {
            System.out.println("Access denied - You are not pld enough!");
        } else {
            System.out.println("Access granted");
        }

    }

    public static void main(String[] args) {
        checkAge(21);
    }

}

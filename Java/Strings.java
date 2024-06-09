package Java;

public class Strings {
    public static void main(String[] args) {
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());
        String text = "Hello World";
        System.out.println(text.toUpperCase()); // Outputs "HELLO WORLD"
        System.out.println(text.toLowerCase());
        String sol = "Please locate where 'locate' occurs!";
        System.out.println(sol.indexOf("locate")); // Outputs 7

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(firstName.concat(lastName));
    }
}

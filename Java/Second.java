package Java;

public class Second {
    String fname = "John";
    String lname = "Doe";
    int age = 24;

    public static void main(String[] args) {
        Second myObj = new Second();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Age: " + myObj.age);
    }
}

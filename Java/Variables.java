package Java;

public class Variables {
    public static void main(String[] args) {
        String name = "Cricket";
        System.out.println("Lets Play " + name);
        String firstName = "Demon ";
        String lastName = "Salvatore";
        String fullName = firstName + lastName;
        System.out.println(fullName);
        int x = 5;
        int y = 7;
        System.out.println(x + y);

        // Student data
        String studentName = "John Doe";
        int studentID = 15;
        int studentAge = 23;
        float studentFee = 75.25f;
        char studentGrade = 'B';

        // Print variables
        System.out.println("Student name: " + studentName);
        System.out.println("Student id: " + studentID);
        System.out.println("Student age: " + studentAge);
        System.out.println("Student fee: " + studentFee);
        System.out.println("Student grade: " + studentGrade);

        // Calculate area of Rectangle

        int length = 4;
        int breadth = 7;
        int area;

        area = length * breadth;

        System.out.println("area of Rectangle: " + area);

        int a = 5, b = 4;
        int sum1 = a + b;
        int sum2 = sum1 + 7;
        int sum3 = sum1 + sum2;
        System.out.println(sum3);

        System.out.println(sum3 > 0);
        int ver = 10;
        ver += 5;
        System.out.println(ver);
    }
}

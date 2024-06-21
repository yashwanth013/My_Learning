package Java;

public class ClassObjectsAttributes {
    int x = 3;
    int y = 4;
    int z = x + y;

    public static void main(String[] args) {
        ClassObjectsAttributes myObj = new ClassObjectsAttributes();
        System.out.println(myObj.z);
    }
}

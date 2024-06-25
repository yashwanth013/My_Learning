package Java;

public class Constructor {
    public static int x = 8;

    public Constructor() {
        x = 7;
        System.out.println("from constructor " + x);
    }

    public static void main(String[] args) {
        x = 10;
        System.out.println(x);
        Constructor Obj = new Constructor();
        System.out.println("from main method " + x);
    }
}

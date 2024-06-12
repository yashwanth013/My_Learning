package Java;

public class Constructor {
    int x;

    public Constructor() {
        x = 7;
    }

    public static void main(String[] args) {
        Constructor Obj = new Constructor();
        System.out.println(Obj.x);
    }
}

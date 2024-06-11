package Java;

public class ClassMethods {
    static void myMethod() {
        System.out.println("Im static method");
    }

    public void myMethod2() {
        System.out.println("Im am public method");
    }

    public static void main(String[] args) {
        myMethod();

        ClassMethods myObj = new ClassMethods();
        myObj.myMethod2();
    }

}

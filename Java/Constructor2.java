package Java;

public class Constructor2 {
    int modelYear;
    String modelName;

    public Constructor2(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructor2 Obj = new Constructor2(1969, "Mustang");
        System.out.println(Obj.modelYear + " " + Obj.modelName);
    }
}

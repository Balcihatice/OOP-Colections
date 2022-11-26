package inheritance_constructor_overloading;

public class Overloading01 {
    public static void main(String s[]) {
        String str = print(6) + print();
        print(str);
    }

    public static int print() {
        return 4;
    }

    public static String print(int i) {
        return "3";
    }

    public static void print(String j) {
        System.out.println(j);
    }
}

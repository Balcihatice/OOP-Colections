package inheritance_constructor_overloading;

public class Overloading02 {
    public static void main(String s[]) {
        go();
        go(15);
        go(6 >= 6);
    }

    public static void go() {
        System.out.println("Bad");
    }

    public static void go(double i) {
        System.out.println("Good");
    }

    public static void go(boolean b) {
        if (b) {
            System.out.println("The best");
        } else {
            System.out.println("The worst");
        }
    }
}

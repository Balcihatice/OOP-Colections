package inheritance_constructor_overloading;

public class Overloading03 {

    public static void main(String[] args) {
        int x = add(2, 7);
        double y = add(3, 6.5);
        double z = add(x, y, 10);
        System.out.println(z);
    }

    static int add(int i, int j) {
        return i + j;
    }

    static double add(double i, double j) {
        return i + j;
    }

    static double add(int i, double j, int k) {
        return i + j + k;
    }

}

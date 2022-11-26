package inheritance_constructor_overloading;

public class C {
    public static void main(String args[]) {

        B obj2 = new B();
        obj2.i = 1;
        obj2.j = 2;
        A r = obj2;//(r) a clasinda yeni variable
        r.display();


        B obj3 = new B();
        obj3.i = 1;
        obj3.j = 2;
        A d = obj3;
        // System.out.println(d.j); hata verir j`e ulasamaz


        B obj4 = new B();
        obj4.i = 1;
        obj4.j = 2;
        A x = obj4;
        System.out.println(x.i);
    }
}
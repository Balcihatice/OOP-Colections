package exceptions;

public class E03 {
    public static void main(String[] args) {
        try {
            int a[] = {7, 8, 9};
            for (int i = 1; i <= 7; i++) {
                System.out.println(a[i]);
            }
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            System.out.println("Done!");
        }

        //  A)     try {
        //           int a[]= {7, 8, 9};
        //           for (int i = 1; i <= 3; i++){
        //               System.out.println(a[i]); }
        //       } catch(Exception e) { System.out.println ("Exception");
        //       }catch(ArrayIndexOutOfBoundsException e) { System.out.println ("Out of index");
        //       }finally { System.out.println("Done!");
        //       }


        //B)
        try {
            int a[] = {7, 8, 9};
            for (int i = 1; i <= 2; i++) {
                System.out.println(a[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Out of index");
        } finally {
            System.out.println("Done!");
        }


    }
}

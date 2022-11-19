package genelsorular;

public class Q01 {
/*
1)Write a function that returns true if you can partition an array into one element and
the rest,such that this element is equal to produc of all other elements excluding itself.

Bir diziyi bir elemana ve geri kalanına bölebilirseniz, bu eleman kendisi hariç diğer tüm
elemanların çarpımına eşit olacak şekilde true döndüren bir işlev yazın.
Example:
[2,8,4,1] -->True
[-1,-10,1,-2,20]-->false
 */
    public static void main(String[] args) {
        int[] arr = {2, 8, 4, 1, 64};

        for (int i = 0; i < arr.length; i++) {
            int carpim = 1;
            for (int x : arr) {
                carpim *= x;
            }
            if (carpim == arr[i] * arr[i]) {
                System.out.println(true);
                System.out.println("Kosulu saglayan eleman: " + arr[i]);
                break;
            }
            if (i == arr.length - 1) {
                System.out.println(false);
            }
        }
    }
}
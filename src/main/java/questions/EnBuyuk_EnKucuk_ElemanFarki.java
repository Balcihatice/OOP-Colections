package questions;

import java.util.Arrays;
import java.util.Scanner;

public class EnBuyuk_EnKucuk_ElemanFarki {
    /*

  Create a function that takes an array and the difference between the largest
  and the smallest numbers.
  Ask user to enter array elements.
     kullanıcının girdigi bir array'in en buyuk elemani ile
     en kucuk elemanının  farkını bulan bir method create ediniz.

           */
    public static void main(String[] args) {
        arrayOlustur();


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen dize uzunlugunu giriniz");
        int lenght = input.nextInt();

        int[] arr = new int[lenght];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Lutfen aray elemanlarini giriniz");
            arr[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int fark = (arr[arr.length - 1]) - arr[0];
        System.out.println("Fark: " + fark);


    }

    //2. yil metod olusturabiliriz

    private static void arrayOlustur() {
        Scanner scan = new Scanner(System.in);
        System.out.print("array uzunlugu giriniz :");
        int uzunluk = scan.nextInt();

        int arr[] = new int[uzunluk];
        for (int i = 0; i < uzunluk; i++) {
            System.out.println("arrayin " + (i + 1) + ".elemanini giriniz :");
            arr[i] = scan.nextInt();

        }
        Arrays.sort(arr);
        System.out.println("arr[son eleman]-arr[ilk eleman] : " + (arr[uzunluk - 1] - arr[0]));

    }
}

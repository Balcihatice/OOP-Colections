package map_sorusu;

import java.util.Arrays;
import java.util.HashMap;

public class Map02 {

    // Verilen bir String'deki harfleri ve harflerin kacar kez kullanildigini
    // return eden bir method yaziniz
    //  Ornek : Input : Can Hoca bir tane   output : { =3, a=3, b=1, r=1, C=1, c=1, t=1, e=1, H=1, i=1, n=2, o=1}

    public static void main(String[] args) {
        String str = "Can Hoca bir tane";
        kacHarfVar(str);
    }

    private static void kacHarfVar(String str) {

        HashMap<Character, Integer> harfveSayi = new HashMap<>();

        char[] chArray = str.toCharArray();
        System.out.println(Arrays.toString(chArray));//[C, a, n,  , H, o, c, a,  , b, i, r,  , t, a, n, e]

        for (char w : chArray) {
            if (harfveSayi.containsKey(w)) {
                harfveSayi.put(w, harfveSayi.get(w) + 1);
            } else {
                harfveSayi.put(w, 1);
            }
        }
        System.out.println(harfveSayi);
    }

    //2.Yol
    public static void harfSayisi(String str) {
        String harf = "";
        for (int i = 0; i < str.length(); i++) {
            String c = str.substring(i, i + 1);
            if (!harf.contains(c)) {
                harf = harf + c;
            }
        }

        for (int i = 0; i < harf.length(); i++) {
            int flag = 0;
            for (int j = 0; j < str.length(); j++) {
                if (harf.charAt(i) == str.charAt(j)) {
                    flag++;
                }

            }
            System.out.print(harf.charAt(i) + " = " + flag + ", ");
        }
    }

}

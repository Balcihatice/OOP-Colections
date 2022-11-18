package hashset_sorusu;

import java.util.HashSet;

public class HashSet01 {
    /*
    Main method altinda bir double hashSet olusturunuz.
    ve bu seti, adi setOlustur ve return tipi hashSet double olan
    ayri bir metod altinda 3.23 , 3.10 , 5.12 , 10.12 , 23.12 degerlerini kullanarak doldurun.
    Adini toplaminiAl koyacagimiz ve parametre olarak bir Double hashSet kabul edecek ayri bir method olusturarak
    hashSetin degerlerinin toplamini alacaksiniz.
    Çıktı--> sonuc = 44.69
     */



    public static void main(String[] args) {
        HashSet<Double> ilkSet = new HashSet<>();
        setOlustur((HashSet<Double>) ilkSet, 3.23, 3.10, 5.12, 10.12, 23.12);
        System.out.println(ilkSet);

        Double toplam = toplaminiAl(ilkSet);
        System.out.println(toplam);

    }
    public static HashSet<Double> setOlustur(HashSet<Double> isim, Double... values) {
        Double arr[] = values;
        for(Double w:arr) {
            isim.add(w);
        }
        return isim;
    }

    public static Double toplaminiAl(HashSet<Double> setinIsmi) {
        Double sum = 0.0;
        for(Double w:setinIsmi) {
            sum += w;
        }
        return sum;
    }


}

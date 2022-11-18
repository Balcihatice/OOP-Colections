package map_sorusu;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Map01 {
    // Asagida verilen map'de yazilim dili java olan kisi isimlerini bir liste olarak donduren
    // bir method yaziniz
    public static void main(String[] args) {


    Map<Integer, String> map1 = new HashMap<>();

        map1.put(101, "Ali, Can, java");
        map1.put(102, "Veli, Yan, java");
        map1.put(103, "Ali, Yan, C#");
        map1.put(1905, "Can, Birtane, Java");


    ArrayList<String> liste = isimler(map1);
        System.out.println(liste);
}

    public static ArrayList<String> isimler(Map<Integer, String> isim) {
        Collection<String> values = isim.values();
        ArrayList<String> adlar = new ArrayList<>();
        for (String w : values) {
            if (w.toLowerCase().contains("java")) {
                adlar.add(w.replace(",", "").replace("java", "").replace("Java", ""));
            }
        }
        return adlar;
    }
}

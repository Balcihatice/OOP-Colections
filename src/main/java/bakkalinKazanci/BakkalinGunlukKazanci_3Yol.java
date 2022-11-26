package bakkalinKazanci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BakkalinGunlukKazanci_3Yol {
    public static void main(String[] args) {


        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        List<Integer> gunlukKazanc = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int i = 1;
        while (i < 8) {
            System.out.println(i + ". gün kazancını giriniz...");
            int kazanc = input.nextInt();
            gunlukKazanc.add(kazanc);
            i++;
        }

        int ortalama = getOrtalamaKazanc(gunlukKazanc);
        String yuksekgunler = getOrtalamaninUstundeKazancGunleri(gunlukKazanc, gunler, ortalama);
        String dusukGunler = getOrtalamaninAltindaKazancGunleri(gunlukKazanc, gunler, ortalama);
        System.out.println("ortalama = " + ortalama);
        System.out.println("dusukGunler = " + dusukGunler);
        System.out.println("yuksekgunler = " + yuksekgunler);

    }

    public static int getOrtalamaKazanc(List<Integer> name) {
        int toplam = 0;
        for (int w : name) {
            toplam = toplam + w;
        }
        int ortalama = toplam / 7;
        return ortalama;
    }

    public static String getOrtalamaninUstundeKazancGunleri(List<Integer> Kazanc, List<String> gunler, int ortalamakazanc) {
        String gun = "";
        for (int i = 0; i < 7; i++) {
            if (Kazanc.get(i) > ortalamakazanc) {
                gun = gun + gunler.get(i) + ", ";
            }
        }

        return gun;
    }

    public static String getOrtalamaninAltindaKazancGunleri(List<Integer> Kazanc, List<String> gunler, int ortalamakazanc) {
        String gun1 = "";
        for (int i = 0; i < 7; i++) {
            if (Kazanc.get(i) <= ortalamakazanc) {
                gun1 = gun1 + gunler.get(i) + ", ";
            }
        }

        return gun1;
    }
}


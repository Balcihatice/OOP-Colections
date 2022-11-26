package bakkalinKazanci;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BakkalinGunlukKazanci_2Yol {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     *           ortalama kazançtan aşağıysa o günleri return yap.
     */

    public static void main(String[] args) {
        //1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
        List<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Sali");
        gunler.add("Carsamba");
        gunler.add("Persembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");
        //2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
        List<Integer> gunlukKazanclar = new ArrayList<>();
        //3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(i<7) {
            System.out.println("Lutfen " + gunler.get(i) + " gununun kazancini giriniz: ");
            int kazanc = scan.nextInt();
            gunlukKazanclar.add(kazanc);
            i++;
        }
        System.out.println(gunlukKazanclar);
        int ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println(ortalamaKazanc);//Ortalama Kazanc

        String ortUstuGunler = getOrtalamaninUstundeKazancGünleri(gunlukKazanclar,gunler,ortalamaKazanc);
        System.out.println(ortUstuGunler);

        String ortAltiGunler = getOrtalamaninAltindaKazancGünleri(gunlukKazanclar,gunler,ortalamaKazanc);
        System.out.println(ortAltiGunler);

    }
    //4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
    public static int getOrtalamaKazanc(List<Integer> name) {
        int sum = 0;
        for(Integer w : name) {
            sum += w;
        }
        return sum/name.size();
    }

    // 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
    //     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //     *           ortalama kazançtan yüksekse o günleri return yap.

    public static String getOrtalamaninUstundeKazancGünleri(List<Integer> gunlukKazanc, List<String> gun, int ortKazanc) {
        String hepsi = "Ortalamanin ustunde gunler:\n";
        for(int i =0; i<7; i++) {
            if(gunlukKazanc.get(i)>ortKazanc) {
                hepsi += gun.get(i) + "\n";
            }

        }
        return hepsi;
    }
    //6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
    //     *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
    //     *           ortalama kazançtan aşağıysa o günleri return yap.
    public static String getOrtalamaninAltindaKazancGünleri(List<Integer> gunlukKazanc, List<String> gun, int ortKazanc) {
        String hepsi = "Ortalamanin altinda gunler:\n";
        for(int i =0; i<7; i++) {
            if(gunlukKazanc.get(i)<ortKazanc) {
                hepsi += gun.get(i) + "\n";
            }
        }
        return hepsi;
    }

}

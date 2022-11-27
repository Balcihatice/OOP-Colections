package ozet_bilgiler;

public class Exception {
    /*
    1) Exception (Istisnai hata) Java'da kodlar calistirilirken meydana gelen beklenmedik durumlardir.
          2) Exceptionlar ile calismanin iki yolu vardir:
              i) try-catch block kullanma ve exception olussa bile calismayi devam ettirme...
              ii) throw exception kullanilarak calismayi durdurma... (Mesela yazilan kod geregi bir dosya uzerinden
                  okuma yapilmasi gerekiyor ve bu dosya eger silinmis ise Java dosyayi bulamaz ve uygulamanin devam
                  etmesi gerekmez.
          3) Eger exception handle edilmez ise (sorun halledilmezse) Java calismayi durdurur.
          4) try-catch kullanilirken try kodu bir ya da birden fazla catch ile birlikte kullanilabilir.
          5) try, catch olmaksizin yalniz kullanilamaz.
          6) Eger yazilmis olan herhangi bir kod satirinda problem olabilecegi dusunuluyorsa try-catch blok icine
             koyulmalidir.
          7) catch blok parantezi icerisine olmasi muhtemel exception Class ismi yazilir.
          8) e.getmessage(); method'u kullanilarak teknik mesajlar elde edilebilir.
             System.out.println(); burada yazilmis olan mesajlar teknik olmayan aciklamalardir.
             e.printStackTrace(); method'u exception ile ilgili detaylica teknik mesaj verir.
             System.err.println(); hata mesajini renkli olarak verir ve bu sayede consol'da diger mesajlardan
             ayirabilmek icin kullanilir.
          9) Eger try body icerisindeki kod sorunsuz calisirsa catch block devreye girmez.



     1)  FileInputStream fis = new FileInputStream("src/main/java/day27exceprions/File1.txt");
    "new" den sonraki kisim hata verir.Cunku biz java`ya verilen adrestekidosyaya git dedik.
    Java iki endiseye kapildi. i) Ya adres yanlissa  ii)Ya verilen adreste dosya yoksa.
    Biz "method isminden " sonra "throws FileNotFoundException" yazarak, Java`ya bu iki endise duydugun durum olursa
    "Exception At" dedik.
    2)  while ((k = fis.read()) != -1){} yazdigimizda read() metodu hata verir.Cunku biz Java ya dosyadaki karakterleri
    oku dedik. Java bir endiseye kapildi.Ya okunmasi gereken karakterler Javanin bilmedigi karakterlerse?
    Biz method isminden sonra "throws IOException" yazarak java`ya bu durumla karsilasinca "Exception At" dedik.

    3) Method isminden sonra "throws IOException" yazarsak Java "throws FileNotFoundException"`i siler.Cunku;
    "IOException" , 'FileNotFoundException" i kapsar."IOException" ,"FileNotFoundException"`in parent`idir.
    onun yaptigi herseyi yapabilir o yuzden "IOException" varken   "FileNotFoundException"`a gerek yoktur.

    "IOException", "Input Output Exception" demektir.

    4) Gordugunuz gibi "IOException" ve "FileNotFoundException" biz kod yazarken daha run butonuna basmadan ortaya cikti.
    Bu tarz Exception`lara "Compile Time Exception" denir. diger adlari "Checked Exception" denir.

    "Compile Time Exception" kesinlikle halledilmelidir(Exception Handling), hakletmeden kod yazmaya devam etmeyiniz



     1) Java Exception`lar olusturarak developer`larin Java kurallarina uymalarini temin etmistir,
    2) Bizde Application uretirken kendi Exception`larimizi olusturarak diger developerlarin bizim ortaya koydugumuz
    kurallara uymalarini temin ederiz.
    3) Java`nin degil, Bizim urettigimiz Exception`lara "Custom Exception" denir.
    4) Custom Exceptin`larda "Run Time Exception" ve "Compile Time Exception" olabilir.
    5) Costum "RunTimeException " uretmek icin "extends RunTimeException" deriz
    6) Costum "CopmpileTimeException " uretmek icin "extends Exception" deriz


                     "throw" ile "throws" arasindaki farklar nelerdir?
           1)"throw" method'un body'si icinde kullanilir. "throws" ise method'un isminden sonra kullanilir.
           2)"throw" dan sonra object olusturulur."throws" dan sonra ise sadece Exception Class'in ismi yazilir.
           3)"throw" method'un icinde istedigimiz yerde Exception uretmek icin kullanilir.
           "throws" ise var olan checked Exception'i atmak icin kullanilir.
           4)"throw" dan sonra sadece bir tane Exception olabilir.
            "throws" dan sonra 1 den fazla Exception olabilir.




     */
}

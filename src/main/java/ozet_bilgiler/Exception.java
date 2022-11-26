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
     */
}

package ozet_bilgiler;

public class FinalKeyword {
     /*
   "final" keyword nedir?

   "final" keyword i) variable`lerde kullanilabilir
                        public final int age = 12;
                        a) atanan deger degistirilemez
                        b)deger atamasi yapmak zorundayiz

                  ii) Method`larda kullanilabilir
                      public final int add(){
                      return a+b;
                      }
                      a)final metodlarin body`si ASLA degistirilemez,
                      b) final metodlar overrid edilemezler
                      Dolayisiyla o method override edilemez.

                 iii) Class`larda kullanilabilir
                 Bir Class`i final yaparsak o Class`i kisirlastirmis oluruz,
                 final Class`in childi olamaz (extend edilemez)
                 ama final class child olabilir.


        "final", "finally", "finalize" aciklayiniz.
        1)"final" bir keyword'dur. Variable, Class, ve Method'lar icin kullanilir.
              "final" keyword i)Variable'larda kullanilabilir.
                        public final int age = 12;
                        a)Atanan deger degistirilemez.
                        b)Deger atamasi yapilmak zorundadir.

                    ii)Method'larda kullanilabilir.
                       public final int add(){
                       return a+b;
                                                                                        }
                        a)Bir method olusturulurken "final" olarak olusturulmus ise
                          o methodun body'si asla degistirilemez. Dolayisiyla o method override edilemez.

                   iii)Class'larda kullanilabilir.
                       Bir Class'i "final" yaparsaniz o Class'i kisirlastirmis olursunuz
                       Bir Class "final" ise o Class'a extend edilemez.
                       "final" Class Child olabilir.
        2)"finally" bir "code block" dur.
          "try-catch" veya sadece "try" ile kullanilir.
          "finally" code block icine yazilan code'lar her halukarda calistirilir.
          Mesela Database ile connection'i kesmek herhalukarda yapilmasi gereken bir fiildir. Bunu "finally" ile yapabiliriz.

        3)"finalize" bir method'dur. Bu method Java tarafindan data'lar imha edilmeden once cagrilir, bu method data'lari
          imha edilecek hale getirir ve daha sonra "Garbage Collector" bu data'lari imha eder.

          "finalize" method'unu Java Developer'lar da cagirabilir ama Java kendi bildigini yapar.

    */
}

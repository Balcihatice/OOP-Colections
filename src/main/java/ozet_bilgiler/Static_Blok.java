package ozet_bilgiler;

public class Static_Blok {
/* //Inheritance'da variable'lar secilirken Java object'in data type'ina bakar.
//Oncelikle istediginiz variable'i Object'in data type'i olan Class'da arar.
//O Class'da bulamamzsa Parent Class'lara bakar.
//Hicbir Parent Class'da bulamazsa hata verir




1) Siz Class olusturdugunuz da Java otomatik olarak gorunmez bir Constructor verir
   Cunku java Class`in bir kalip oldugunu ve object olusturmak icin yaratildigini ve object
   olusturmak icin Constructorun sart oldugunu bilir.
   2) Javanin otomatik olarak olusturdugu bu gorunmez Constructor`a default Constructor denir.
   3) Siz kendiniz herhangi bir Constructor olusturdugumuzda java default Constructri siler
   4) Bir Classta biden fazla Constructor olabilir. Fakat bu Constructorlarin parametreleri farkli olmalidir
   5) "this" keyword "Bu Class" anlamindadir." this.price" demek bu Clastaki "price" isimli variable demektir
   "this.price" syntex`i constructor`larin icinde kullanilir
   6) Constructor kullanarak variablelar uzerinde yaptigimiz degisimler sadece object uzerindeki variable larin degerlerini degistirir,
   Clasdaki variable degerlerini degistiremez


 //Object olusturken objectin data type child Classlardan secilemez
        // Inheritance de Method secilirken Java Constructor`a bakar
        //Oncelikle istediginiz metodu contructuri kullanilan Class`tan alir
        //O Classta bulamzsa Parent Class`lara bakar.Hic bir Parent Classta bulamazsa hata verir




1)Java da Object olustururken Constructor'lar Parent'dan Child'a dogru calistirilir.
    2)Java en ust parent constructor'a cikabilmek icin "super()" kodunu kullanir.
    3)"super()" kodu her constructor'in "ilk satirinda" "gizli" olarak bulunur.
    4)"super()" kodunu isterseniz gorunur sekilde de yazabilirsiniz, Java kizmaz.
    5)"super()" kodunu gorunur sekilde de yazarsaniz sakin haaa ilk satir disinda bir satira koymayiniz, hata verir.
    6)"super()" kodu Parent Class'dan constructor cagirmaya yarar.



    //static block`lar ihtiyacimiz olan variable`larin class olusturma safhasinda elimizde olmasini saglar
    // static block`lar main methoddan ve diger tum methodlardan once calistirilir.(herseyden once calisir)
    //static blok`lar icinde sadece "static variable"`lara deger atanabilir.
    //birden fazla static blok varsa ustteki once calistirilir.


    static keyword nedir?
    static keyword class'a baglanmis class elemanlaridir
    static class elemanlari butun Object'lerin ortak elamanidir.
    static ler uzerinde yapilan her degisiklik butun objeleri etkiler tum objelerde gorunur.
    static Class elemanlarina Class uzerinden ulasilir.
    */

}

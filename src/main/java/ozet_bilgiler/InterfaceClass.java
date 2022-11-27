package ozet_bilgiler;

public class InterfaceClass {

     /*
        1) Atomic olsun diye "parent"i parcaladim ama bir "Child Class" in birden fazla "parent" i oldu,
        bu ise Java'da mumkun degildir. Cunku Java "multiple Inheritance" i desteklemez.
        "multiple inheritance" class'larda mumkun degildir fakat Java "interface" isimli yeni bir yapi olusturdu
        bu yapida "multiple inheritance" a musaade etti.

        2)Interface'lerdeki tum method'lar "abstract" oldugu icin "interface" lere "fully abstraction" denir.
          "Abstract Class" larda abstract method ve "concrete method" bir arada kullanildigi icin
          "Abstract Class" lara "fully abstraction" denmez.


    //interface'lerdeki tum method'lar "abstract" olmak zorundadir.

    //interface'lerde abstract method olustururken "abstract" keyword kullanmaya gerek yoktur.
    //Cunku Java o method'un abstract oldugunu bilir.

    //interface'lerdeki tum method'lar Java tarafindan otomatik olarak "public" kabul edilir bu yuzden
    //o method'lar icin "public" yazmaya gerek yoktur.

    Abstract methodlar sadece ne yapilacagini soyler(what to do)
"Concrete" methodlar ne yapilacagi ile birlikte nasil yapilacagina da soyler(how to do)

"Esasinda interface ler bir yapilacak isler listesidir.(To do List)

    interfacelerin icinde default ve static olarak conceret method olusturulabilir

"Multiple parent interface kullandigimizda;ayni
    method ismi ile birden fazla method olusturursak bu methodlarin return typelari ayni olmalidir
    Aksi takdirde hata verir.

    Interface`lerde constructor yoktur.yani object olusturamayiz
    Abstract calsslarda class olduklari icin constructor vardir.ama
    constructorlar abstract classlarda object olusturamazlar.


            Child        Parent
    class --->>> interface ===>>> implement
    Class --->>> Class ===>> extend
    Interface --->>> Interface ===>>>> extend
    Interface --->>> Class ===>>> Mumkun degil

    SORU : Abstract Class ile Interface`in farklari nelerdir
            ( once methodlar sonra variavleler sonrada parent child hakkinda konusun)
 1)Method:
    Abstract Class hem abstract hemde concrete methodlar icerebilir
    Interface`ler ise sadece abstract method`lar icerir,Ama Interface`ler icinde de
    "default" ve "static" keyword ler kullanarak concerete methodlar olusturabiliriz.
            2) Variable:
    Abstrarct Class`larda normal Classl`arda odugu gibi her turlu variable olusturulabilir.
            Interface`lerde ise variable`ler public static ve final olmak zorundadir
 3) Inheritance:
            'Abstract' Class`lar class olduklari icin Multiple inheritance`a musaade etmezler.
   "Inheritabnce"ler ise "multiple inheritance" desteklerler.
 4) "Abstract Class" larda constructor vardir ama object olusturmada kullanilmazlar
    "Interface"lerde ise constructor olmadigindan object olusturulamazlar.


    SORU: Object Oriented Programing Language prensibleri nelerdir:

            1)Inheritance  2)Polymorphism  3)Encapsulation  4)Abstraction

*/
}


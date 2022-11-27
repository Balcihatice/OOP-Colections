package ozet_bilgiler;

public class Encapsulation {

// Encapsulation: "Data Hiding(Gizlemek)" demektir.
// Data`yi Nicin gizlersiniz ? Data`yi dis etkenlerden korumak icin.
// Data`yi nasil gizlersiniz? Acces modofier`ini "private" yaparak gizlerim.
// Data`yi gizledikten sonra baska Class`lardan okumak istersen ne yaparsin?
// "get" method`lar(getter) olusturarak gizledigimiz data`lari okunur hale getirebiliriz.
// Data`yi gizledikten sonra baska Class`lardan degistirmek istersen ne yaparsin?
// "set method"lar(setter) olusturarak gizledigimiz data`lari degistirebiliriz.
// Variable`in data type`i ne ise get method`un return type`i ayni olmalidir.
// get methodlar`i isimlendirirken "get+<variable name>" , ancak variable`in data type`i boolean ise "is+

/*
    1) Encapsulation kisaca "......" demektir
    2) Basarili bir Encapsulation asagidaki ozelliklere sahip olmalidir.
            a)Nasil kullanilacagi belli olmalidir.(Direksiyon gibi)
    b)Kodun karmasikligi kullanimin karmasikligina sebep olmamalidir.Yani cok karmasik kodlardan olusan bir yapi basit bir sekilde kullanilabilmelidir.
            c)Kod içinde Bir bolumun bozulmasi diger bolumlerin bozulmasina sebep olmamalidir.
            3) Encapsulation nasil yapilir?
    a)Access modifier'lari (.....)olarak kullanılır
    b) getter ve setter methodlari ile "encapsulated" datalara ulasip onlari okuyabilir(.....) ve degistirebiliriz(.....)   .
            4) Encapsulation'in faydalari
    a) Esneklik(Flexibility). Normalde asagidaki ornekte age variable'inin degeri 25'dir ama diger class'larda setAge() methodunu kullanarak age variable'inin degerini istedigimiz gibi degistirip kullanabiliriz.
    b) Reusability. getter ve setter method'lari bir kere olustururuz sonra proje icindeki tum classlar'dan istedigimiz kadar kullanabiliriz.
    c) Istedigimiz datayi getter() method'u olusturarak okunabilir hale getirebiliriz. Istedigimiz datayi getter() method'u olusturmayarak OKUNAMAZ hale getirebilirim.
            d) Istedigimiz datayi setter() method'u olusturarak degistirilebilir yapabiliriz. Istedigimiz datayi setter() method'u olusturmayarak DEGISTIRILEMEZ yapabiliriz.
    e) Kullanicinin kulandigi sistem arkasindaki karmasik yapiyi kullaniciya gostermez. Boylece kullanici yapmak istediklerini daha rahat yapar.
            Not : Tum variable'lar private ve sadece getter() olusturdum. Bu tarz bir class'da data'lar sadece okunabilir, degistirilemez.  String'lerde degistirilemez yani (....)'dir . Bu tarz class'lara (....) class denir, yani Setter'i OLMAYAN classlara denir.
            5) Bir Class'da
    a) Tum variable'lar "private" ise
    b) Tum getter()'ler ve tum setter()'ler olusturulmus ise bu class "(.....)" olarak adlandirilir.
            6) Getter() ve Setter() methodlarina ayni zamanda "Java Beans"da denir.
            7) Encapsulation veriyi saklamak ve güvenli kılmak için kullanılır , değişkenler saklanır.
            A)Data Hiding-private-getter-setter- immutable-immutable-fully encapsulated
    B)İllegal-public-readable-replaceable-mutable-immutable-encapsulated
    C)Access Specifier-protected-getter-replaceable-mutable -mutable-capsulated
    D)Unauthorized-Private-readable-replaceable-immutable-mutable-fully capsulated
    E)Basic-null-readable-setter-mutable -immutable-more capsulated
    */


}

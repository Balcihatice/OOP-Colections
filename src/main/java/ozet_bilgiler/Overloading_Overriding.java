package ozet_bilgiler;

public class Overloading_Overriding {
     /*
    @Override annotation`ini kullanarak, Java`nin yaptigimiz override islemini kontrol etmesini saglariz
    1- Override yaparken methodun body si degistirilir.
    2- Override yaparken ASLA method signature`a(isim ve parametre) degistirilmez.
    3- Override yaparken "inheritance" olmak zorundadir.
    4- Override yaparken "acces modifier"lar belli kurallara gore farklilastirilabilirler.
       i) "private" metodlar override edilemezler.
       ii) child class`daki override "edilen method" methodun acces modifier`i
       parent classtaki methodun acces modifieri ile ayni veya daha genis olmalidir
       Not: Child Class`in acces modifier`i daha dar olamaz.
       iii) defauld methodlar ayni package icindeyse override edilebilirler,
       farkli package`den override edilemezler.
    5- Parent Classtaki metodun return type`i void ise, return type degistirilemez.
    6- Parent Classtaki metodun return type`i primitive ise, return type degistirilemez.
    7- Parent Classtaki metodun return type`i Wrapper Class ise, return type degistirilemez.
    8- Parent Classtaki metodun return type`i Parent class ise, return type Child`lardan biri olabilir
    NOT : Aralarinda parent child iliskisi olmayan Class`lar overriding de return type degisiminde kullanilamazlar
    Mesela, "Short" "integer"dan kucuktur fakat aralarinda parent- child iliskisi olmadigindan "Integer" yerine
    "Short" kullanamayiz.
      NOT : Child`daki methodun return type`indan Parent daki return type`a gidiste "IS_A" relationship"olmali
      NOT : Aralarinda "IS_A" relationship olan Data type`lara "Covariant" denir.
    9 - final metodlar override edilemezler,cunku overriding de
    metod body degistirilir,fakat finel metod body degistirilmesine musaade etmez
   10 - Polymorphism  = Overloading + Overriding dir( coklu yapi) demektir.
     NOT: Polymorphism nedir derlerse overloading ve overriding`i anlatin.
    11- Overloading - Overriding arasindaki farklar nedir?
        i) Overloading icin inheritance gerekmez,fakat overriding icin gerekir.
        ii) "Private" method`lar overload edilebilir ama Override edilemezler.
       iii) "final" method`lar Overload edilebilir, Override edilemezler
       iv) Overloading "static plolymorphisim" olarak, "overriding dinamik" plolymorphisim olarak adlandirilir.
         Cunku statik method`lar Overload edilebilir, Override eddilemezler.
       v) Overloading de method signature deisir, ama overriding demethod signature`a dokunulmaz.
     */

}

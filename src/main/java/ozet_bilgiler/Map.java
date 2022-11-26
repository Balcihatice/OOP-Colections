package ozet_bilgiler;

public class Map {

     /*

     metodun sol tarafina key, sag tarafina value denir.;Map ler key value kullanilir.

     Key`ler unique`dir.
     Map'lerde key kismi tekrarsiz data icerir.Null tekrarsiz olarak kullanilir,
     Value kismi unique olmak zorunda degildir.tekrarli olabilir. Null bircok kere kullanilabilir.
     Map`de Eleman kavrami yerine "EntrySet" ifdesi kullanilir.map in 2 tane entry var deriz
     HashMap`ler rastgele sirama yaparlar,SuperFast`tir.

     1) HashMap<String, Double> salaries = new HashMap<>(); kodu yazdigimizda Java memory`de 16 kutu iceren bir yapi olusturur
     Bu yapidaki herbir kutuya index verir, Indexler sifirdan 15`e kadardir.

     2) Biz salaries.put("dev",130000.00); kodunu yazdigimizda Java key icin bir HashCode olusturur,Bu hashCodu
     15`e boler ve kalani index olarak kullanir.Bu elemani o index`e yerlestirir.
     Yerlestiriken 4`lu yapi olusturur,Bu yapinin ilk bolumune HasCodu koyar,ikinci bolumune key`i,ucuncu
     bolumune value`yu ve dorduncu bolumune pointer`i koyar.
     Bu cok bolumlu yapi LikedList`lerdeki "Node"dur.Yani HashMap bucked`lara koydugu datayi LinkedList olarak depolar.

    4) Java null icin hep HashCode olarak "zero" uretir,o yuzden key null oldugunda eleman ilk bucket`e yerlestirilir,
    bundan dolayi key`si null olan elemanlar Map`in icinde genellikle ilk sirada gorunurler

    5) Java normalde HashCode`lari unique yapar,ama bazen trafik kazasi gibi farkli iki eleman icin ayni
    HashCode uretilebilir. Buna "Hash Collision" denir Hash Collision meshur bir Java development problemidir,Bu problemle
    karsilasinda developerlar problemi cozmek icin Code yaralar,ama bu coreJava`nin konusu degildir.




    1)HashTable bir map`tir
    2)HashTable entry setleri herhangi bir siralamaya tabii tutmaz.
    3)HasTable,HashMap'lerden daha yavaştır çünkü HasTable lar thread-safe(aynı andan birden fazla iş yapabilme becerisi)
    ve synhronize'dir(çoklu işlerin zaman kazandıracak şekilde sıralanabilmesidir.)


    Tree gorunce natural order aklimiza gelmeli.
    Tree Map`ler entrySet`leri key`lere gore "natural order" gore siralar
    TreeMap`ler en yavas map`lerdir
    TreeMap`ler thread-safe ve syncronized degildir.



     */
}

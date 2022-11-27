package ozet_bilgiler;

public class Lambda {
    /*

    Note
Stream nesneleri tek kullanımlıktır. Stream nesnesinin çoğu metodu yeni bir Stream nesnesi sunmaktadır.
 Bu sebeple tüm operasyonlar zincirlemeli olarak yapılabilmektedir.

    forEach:
Stream içerisindeki yığınsal veriyi tek tek tüketmek için yapılandırılmıştır. Consumer arayüzü türünden bir parametre bekler.
List names = Arrays.asList("Ali","Veli","Selami","Cem","Zeynel","Can","Hüseyin");
Stream stream = names.stream();
stream.forEach(name -> {
    System.out.println(name);
});
   veya stream.forEach(System.out::println);


    Filtreleme
Stream üzerinde filter() metodu çağrılarak filtreleme yapılabilir. filter() metodu bir predicate alır ve stream üzerindeki her bir eleman için bu predicate çalıştırılır ve predicate hangi eleman için true dönerse o elemanlar filtrelenir ve pipelineda yoluna devam eder.
List names = Arrays.asList("Ali", "Veli", "Selami", "Cem", "Zeynel", "Can", "Hüseyin");

Stream stream = names.stream(); (1)

Predicate predicate = name -> name.length() < 4; (2)

Stream filtered = stream.filter(predicate); (3)

filtered.forEach(System.out::println); (4)
1-Stream nesnesi elde ediliyor.
2-Predicate sorgusu hazırlanıyor
3-Süzme işlemi yapılıyor, yeni bir Stream nesnesi sunuluyor.
4-Listeleniyor. [Ali, Cem, Can]



Mapleme:
Stream üzerinde dolaşırken bazen elimizdeki değerleri farklı tipte verilere dönüştürmek yada tipini değiştirmeden sadece değer üzerinde değişiklik yapmak isteyebiliriz. İşte bu durumda map() metodu yardımıyla dönüşüm işlemini yapabiliriz.
String[] values = {"1", "2", "3"};
Arrays.stream(values)
         .map(val -> Integer.parseInt(val))
         .forEach(a -> System.out.println(a));


 *   distinct:

    Bir Stream içerisinden tekrarlı veriler çıkarılmak isteniyorsa distinct metodundan faydalanılabilir.
    IntStream stream = IntStream.of(1, 1, 2, 3, 5, 8, 13, 13, 8); (1)

            stream .distinct().forEach(System.out::println); (2)
   1- IntStream nesnesi
   2-  [1,2,3,5,8,13]


sorted:
Stream içerisindeki yığınsal verinin sıralanmış Stream nesnesini döndürür.
IntStream stream = IntStream.of(13, 1, 3, 5, 8, 1, 13, 2, 8); (1)

stream.sorted().forEach(System.out::println); (2)
1-IntStream nesnesi
2-[1,1,2,3,5,8,8,13,13]


collect

Stream türünden nesneler, yığın verileri temsil eden özel nesnelerdir. Fakat Stream biçimi bir veri yapısı sunmamaktadır. collect metodu ağırlıklı olarak , Stream nesnelerini başka biçimdeki bir nesneye, veri yapısına dönüştürmek için kullanılmaktadır.
Stream#collect metodu Collector türünden bir parametre kabul etmektedir. Bu parametre ile istendik türe dönüşüm sağlanmaktadır. Collector türünden arayüzler, Collectors sınıfının çeşitli statik metodlarıyla elde edilebilmektedir.
List names = Arrays.asList("Ali", "Veli", "Selami", "Veli", "Selami", "Can", "Hüseyin");

List list = names.stream().collect(Collectors.toList()); (1)

Set set = names.stream().collect(Collectors.toSet()); (2)

Long count = names.stream().collect(Collectors.counting()); (3)

String collect = names.stream().collect(Collectors.joining(" - ")); (4)

Map<Integer, List> integerListMap = names.stream().collect(Collectors.groupingBy(name -> name.length())); (5)
1-Stream nesnesinden List nesnesi üretir.List[“Ali”, “Veli”, “Selami”, “Veli”, “Selami”, “Can”, “Hüseyin”]
2-Stream nesnesinden Set nesnesi üretir.Set[“Ali”, “Veli”, “Selami”,”Can”, “Hüseyin”]
3-Stream nesnesinin eleman sayısını üretir.7
4-Stream nesnesini birleştirir.Ali – Veli – Selami – Veli – Selami – Can – Hüseyin
5-Stream nesnesini isim uzunluğuna göre gruplar.


reduce:

Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen
sonuç bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.

// Lambda ile
        int result = IntStream
                .of(1, 2, 3, 4, 5)
                .reduce(1, (once, sonra) -> once*sonra);

// veya Method reference ile
            result = IntStream
            .of(1, 2, 3, 4, 5)
            .reduce(1, Math::multiplyExact);


*/


}

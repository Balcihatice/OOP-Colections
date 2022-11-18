package oop_polimorphism;

public class Runner {

    public static void main(String[] args) {
        Civciv civciv1 = new Civciv();
        hayvanSesCikar(civciv1);


        Ordek ordek1 = new Ordek();
        hayvanSesCikar(ordek1);
//Her istenen obje icin yeni method yazmak dinamik kod degildir
        //
    }
    public static void hayvanSesCikar(Animal animal){

        animal.sesiCikar();
    }
}

package oop_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OOP_Lambda {
    public static void main(String[] args) {

     /*Create 4 objects by using Can class(
           private String season;sezon
            private String courseName;kurs adi
            private int averageScore;ortalama puan
            private int numberOfStudents;ogrenci no
            ) */
//Add them into a list/Onları bir listeye ekle
//Check if all average scores are less than 98/Tüm ortalama puanların 98'den az olup olmadığını kontrol edin
//Check if all course names contain "Day" word/Tüm ders adlarının "Gün" kelimesini içerip içermediğini kontrol edin
//Check if any number of students is 154/Herhangi bir öğrenci sayısının 154 olup olmadığını kontrol edin
//Check if any season is Winter/Herhangi bir mevsimin Kış olup olmadığını kontrol edin
//Check if no number of students is 100/Herhangi bir öğrenci sayısının 100 olup olmadığını kontrol edin
//Sort the elements in natural order according to the average score/Öğeleri ortalama puana göre doğal sırayla sırala
//Sort the elements in reverse order according to the number of students/Öğeleri öğrenci sayısına göre ters sırada sırala
//Sort the elements in reverse order according to the course name/Kurs adına göre öğeleri ters sırada sıralayın

        Lambda01 courseTurkishDay = new Lambda01("Summer", "Turkish Day", 97, 128);
        Lambda01 courseTurkishNight = new Lambda01("Winter", "Turkish Night", 98, 154);
        Lambda01 courseEnglishDay = new Lambda01("Spring", "English Day", 95, 132);
        Lambda01 courseEnglishNight = new Lambda01("Winter", "English Night", 93, 144);

        //Add them into a list/Onları bir listeye ekle
        List<Lambda01> list = new ArrayList<>();
        list.add(courseTurkishDay);
        list.add(courseTurkishNight);
        list.add(courseEnglishDay);
        list.add(courseEnglishNight);

        System.out.println(list);

        //Check if all average scores are less than 98
        //Tüm ortalama puanların 98'den az olup olmadığını kontrol edin
        boolean result1 = list.stream()
                .allMatch(t -> t.getAverageScore() < 98);
        System.out.println(result1);//false

        //Check if all course names contain "Day" word
        //Tüm ders adlarının "Gün" kelimesini içerip içermediğini kontrol edin
        boolean result2 = list.stream()
                .allMatch(t -> t.getCourseName().contains("Day"));
        System.out.println(result2);

        //Check if any number of students is 154
        boolean result3 = list.stream()
                .anyMatch(t -> t.getNumberOfStudents() == 154);
        System.out.println(result3);

        //Check if any season is Winter
        boolean result4 = list.stream()
                .anyMatch(t -> t.getSeason().equals("Winter"));
        System.out.println(result4);

        //Check if no number of students is 100
        boolean result5 = list.stream()
                .noneMatch(t -> t.getNumberOfStudents() == 100);
        System.out.println(result5);//true

        //Sort the elements in natural order according to the average score
        list.stream()
                .sorted(Comparator.comparing(Lambda01::getAverageScore))
                .forEach(t -> System.out.println(t + " "));

        System.out.println("===============");

        //Sort the elements in reverse order according to the number of students
        list.stream()
                .sorted(Comparator.comparing(Lambda01::getNumberOfStudents).reversed())
                .forEach(t -> System.out.println(t + " "));

        System.out.println("===============");

        //Sort the elements in reverse order according to the course name
        list.stream()
                .sorted(Comparator.comparing(Lambda01::getCourseName).reversed())
                .forEach(System.out::println);

    }
}


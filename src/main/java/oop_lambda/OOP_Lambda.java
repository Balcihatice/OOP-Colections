package oop_lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class OOP_Lambda {
    public static void main(String[] args) {



     /*Create 4 objects by using Can class(
         private String season;
            private String courseName;
            private int averageScore;
            private int numberOfStudents;
            ) */
//Add them into a list
//Check if all average scores are less than 98
//Check if all course names contain "Day" word
//Check if any number of students is 154
//Check if any season is Winter
//Check if no number of students is 100
//Sort the elements in natural order according to the average score
//Sort the elements in reverse order according to the number of students
//Sort the elements in reverse order according to the course name

        Lambda01 courseTurkishDay = new Lambda01("Summer", "Turkish Day", 97, 128);
        Lambda01 courseTurkishNight = new Lambda01("Winter", "Turkish Night", 98, 154);
        Lambda01 courseEnglishDay = new Lambda01("Spring", "English Day", 95, 132);
        Lambda01 courseEnglishNight = new Lambda01("Winter", "English Night", 93, 144);

        //Add them into a list
        List<Lambda01> list = new ArrayList<>();
        list.add(courseTurkishDay);
        list.add(courseTurkishNight);
        list.add(courseEnglishDay);
        list.add(courseEnglishNight);

        System.out.println(list);

        //Check if all average scores are less than 98
        boolean result1 = list.stream()
                .allMatch(t -> t.getAverageScore() < 98);
        System.out.println(result1);//false

        //Check if all course names contain "Day" word
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


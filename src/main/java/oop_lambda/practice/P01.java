package oop_lambda.practice;

import oop_lambda.Lambda01;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class P01 {

    /*
                            <========= No Test Today ==========>
        WARM UP (10 Minutes)
        1) Create a package name it as "LambdaPractice"
        2) Create a class name it as "P01"
        3) Create a String list which has 5 String elements.
        4) 3 of them will start with the letter "J"
        5) If the elements are starting with the letter "A" and the length of the elements
           is less than 5, print them in upper case in a list on the console.
   */

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ayva");
        list.add("Java");
        list.add("Amerika");
        list.add("Canada");
        list.add("Anne");
        //System.out.println(list);
        startWithABestenKucuk(list);
    }


    public static void startWithABestenKucuk(List<String> list) {

        System.out.println(list.stream().map(t -> t.toUpperCase()).
                filter(t -> t.length() < 5 && t.startsWith("A")).collect(Collectors.toList()));


    }
}

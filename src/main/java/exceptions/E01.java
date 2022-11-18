package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E01 {

    public static void main(String[] args) {
        try {
            FileInputStream f = new FileInputStream("src/daypackage/TextFile");

        } catch(FileNotFoundException e) {
            System.out.println("Good");
        } catch(IOException e) {
            System.out.println("Bad");
        }finally {
            System.out.println("Not bad");
        }
    }
    /*
    A) Eğer FileNotFoundException ve IOException yer degistirirse Compile Time Error verir.
    B) Eğer IOException silinirse Compile Time Error verir
    C) Eğer finally silinirse ekranda ya hiçbir şey görünmez veya output Good olur
    D) Output "Bad" olamaz.

            cevap:A
     */

}

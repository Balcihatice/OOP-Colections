package questions;

import java.util.Scanner;

public class RandomMethodCreations {

    public static void main(String[] args) {
        // Soru1: klavyeden girilen bir cümle girilecek. Bu cümlenin için kaç tane 'istenilen' harfinin
        // olduğunu söyleyen method create edin ( kelime= kalem ise burda cevap 1 dir)

        Scanner input = new Scanner(System.in);

        System.out.println("Bir cumle giriniz ");
        String[] cumle = input.nextLine().trim().toLowerCase().split("");

        String istHarf = "e";
        String istHarf1 = istHarf.substring(0, 1);

        int count = 0;

        for (String w : cumle) {

            if (w.equals(istHarf1)) {
                count++;
            }

        }
        System.out.println("istenilen harf " + count + " adet vardir");


        // Example: 20 elemanlı bir dizi(Arrays) tanımlayın ve içini Random sınıfını kullanarak 0 ile 100 arasında
        // rastgele sayılar ile doldurun. Oluşun dizide kaç tek ve kaç çift sayı olduğunu bulan algoritma yazın.


        counter(1, 0, 1000);
        // metod yazarak cozduk

    }

    public static void counter(int number1, int number2, int target) {

        for (int i = 0; i < target; i++) {

            int random = (int) ((Math.random() * target));

            System.out.println(random);

            if (random == number1) {

                number1++;

            } else if (random == number2) {

                number2++;
            }

        }
        ;
        System.out.println("number1 count : " + number1 + " ,number2 count : " + number2);
    }

}

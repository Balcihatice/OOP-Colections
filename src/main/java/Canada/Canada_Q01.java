package Canada;

import java.util.Scanner;

public class Canada_Q01 {
    /*   Canada Marketinden taze interview soruları.
1)Write a function that returns true if you can partition an array into one
element and the rest,such that this element is equal to produc of all other
elements excluding itself.
Bir eleman kendisi haric digerlerinin carpimina esit ise true olacak
            Example:
            [2,8,4,1] -->True
            [-1,-10,1,-2,20]-->false
        2)Aşağıdaki sıralamaları sağlayan Java Kodunu yazınız.
    Sortit[1,3,2]->[1,2,3]
    Sortit[[1][3][2]]->[[1][2][3]]
    Sortit[1,[3],2]->[1,2,[3]]
            3)Replace(-314159.2653 -->"-$314,159.21")
            */


    private static boolean canPartition(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int prd = 1;
            for (int j = 0; j < data.length; j++) {
                if (j == i)
                    continue;
                prd *= data[j];
            }
            if (prd == data[i])
                return true;
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array range: ");
        int x = sc.nextInt();
        int[] testing = new int[x];
        for (int y = 0; y < testing.length; y++) {
            System.out.println("Enter the Array number: " + y);
            testing[y] = sc.nextInt();
        }
        Canada_Q01 question1 = new Canada_Q01();
        System.out.println(question1.canPartition(testing));


        //Replace(-314159.2653 -->"-$314,159.21")
        String str = "-314159.2653";
        str = str.replace("-","-$");
        System.out.println(str);
    }

}

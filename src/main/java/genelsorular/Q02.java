package genelsorular;

import java.util.Arrays;

public class Q02 {
/*
Aşağıdaki sıralamaları sağlayan Java Kodunu yazınız.
Sortit[1,3,2]->[1,2,3]
Sortit[[1][3][2]]->[[1][2][3]]
Sortit[1,[3],2]->[1,2,[3]]
 */

    public static void main(String[] args) {
        String [] arr={"1","3","[2]"};
        System.out.println(Arrays.toString(arr));
        String [] brr= new String[arr.length];
        for(int i =0;i<arr.length;i++){
            brr[i]=arr[i].replaceAll("\\p{Punct}","");
        }
        Arrays.sort(brr);
        for(int i=0;i<brr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j].contains(brr[i])){
                    String temp="";
                    temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}

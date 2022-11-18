package exceptions;

public class E04 {

    // hangileri dogrudur
    public static void main(String[] args) {
//A
        int arr[] = {9, 8, 7, 6};
        try {
            System.out.print("Good");
            System.out.print(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Better");
        }
        //output:GoodBetter
        System.out.println();
        //B
        String s2 = null;
        try{
            System.out.println(s2.length());
            System.out.print("Good");
        }catch(NullPointerException e) {
            System.out.print("Better");
        }
//Output GoodBetter
        System.out.println();

//C
        String s = "123";
        System.out.println(s + 1); // A
        int num = Integer.parseInt(s);
        System.out.println(num + 1);
        // B A = 1231 ve B = 124

//D
        String s3 = "abc";
        try{
            System.out.println(Integer.parseInt(s3));
        }catch(NullPointerException e) {
            System.out.print("Better");
        }catch(NumberFormatException e) {
            System.out.print("The Best");
        }

//output: The Best


    }
}

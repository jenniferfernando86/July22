package July22;

public class Array {
    public static void main(String[] args) {
        //int x = 10;
        //int num[] = {10, 20, 30, 40, 50, 60, 70};
        //int x; //declaration
        //x = 10; // initialization

        int num[] = new int[5];
        String fruits[] = {"Apple", "Mango", "Orange"};
        System.out.println("fruits : " + fruits[0] + "," + fruits[1] + "," + fruits[2]);
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        num[3] = 40;
        num[4] = 50;


        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println(num[3]);
        System.out.println(num[4]);


    }
}

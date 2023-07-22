package July22;

import java.util.Scanner;

public class ArrayScannerString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int size = scanner.nextInt();
        String animals[] = new String[size];


        System.out.println("Enter the names of the Animals you like : ");
        //getting input
        for (int i = 0; i < animals.length ; i++) {
            System.out.print("Animal["+(i+1)+"]: ");
            animals[i] = scanner.next();
        }
        System.out.println("The Animals you like are : ");
        //printing output
        for (int i = 0; i < animals.length ; i++) {
            System.out.println(animals[i]);
        }

    }
}

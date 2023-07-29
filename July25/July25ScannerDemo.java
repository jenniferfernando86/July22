package July25;

import java.util.Scanner;

public class July25ScannerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter the First Number ");
        int num = scanner.nextInt();

        System.out.println( "Enter the Name ");
        //String name = scanner.nextLine(); -- this will not allow the input string to be entered so use only next.
        String name = scanner.next();

    }
}

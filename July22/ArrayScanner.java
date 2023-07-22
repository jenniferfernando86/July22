package July22;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        int x;
        x = 10;

        int num[] = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your values for the array");

        for (int i = 0; i < num.length ; i++) {
            num[i] = scanner.nextInt();
        }
        for (int i = 0; i < num.length ; i++) {
            System.out.println(num[i]);
        }

    }
}

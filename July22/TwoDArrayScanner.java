package July22;

import java.util.Scanner;

public class TwoDArrayScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arr[][] = new int[3][3];
        System.out.println("Enter the matrix : ");


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length; j++){
                System.out.print("Enter the value for array index "+i+", "+j+": ");
                arr[i][j] = scanner.nextInt();
            }


        }
        System.out.println("The numbers you have entered are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }

    }
}

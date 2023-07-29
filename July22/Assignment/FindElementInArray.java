package July22.Assignment;

public class FindElementInArray {
    public static void main(String[] args) {
        int arr[]= {2, 4, 6, 7, 8};
        int num = 7;
        for (int i=0; i < arr.length; i++){
            if (arr[i] == num) {
                System.out.println(" The element found in this index is " + i);
                System.out.println("The element in this index is " + arr[i]);

            }
        }
    }
}

package July22.Assignment;

public class ReverseAnArray {
    public static void main(String[] args) {
        int arr[]= {2, 4, 6, 7, 8};
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

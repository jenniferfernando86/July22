package July22.Assignment;

public class FindLargestNumbInArray {
    public static void main(String[] args) {
        int arr[] = {1, 2, 13, 4, 5, 6};
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>temp){
                temp = arr[i];
            }
        }
        System.out.println("The Largest number in array is "+ temp);
    }
}

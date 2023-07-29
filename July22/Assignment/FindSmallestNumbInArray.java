package July22.Assignment;

public class FindSmallestNumbInArray {
    public static void main(String[] args) {
        int arr[] = {15, 2, 13, 4, 5, 1};
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<temp){
                temp = arr[i];
            }
        }
        System.out.println("The Smallest number in array is "+ temp);
    }
}

package StringAssignment;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = new String("pragra");
        char c1[] = s1.toCharArray();
        for (int i = c1.length-1; i >= 0; i--) {
            System.out.print(c1[i] + " ");
        }
    }
}

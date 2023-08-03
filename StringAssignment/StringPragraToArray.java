package StringAssignment;

public class StringPragraToArray {
    public static void main(String[] args) {
        String s1 = "Pragra";
        char c1[] = s1.toCharArray();
        for (int i = 0; i< s1.length(); i++){
            System.out.print(c1[i]);
        }
    }
}

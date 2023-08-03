package StringAssignment;

public class FindLetterGinPragra {
    public static void main(String[] args) {
        String s1 = new String("pragra");
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'g'){
                System.out.print(" 'g' found at " + i + " index");
            }

        }
    }
}

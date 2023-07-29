package July25;

public class StringDemo {
    public static void main(String[] args) {

        //What is a string? - A collection /array of characters/ non- primitive data type/its a class -
        //it starts with capital / embedded within double quotes//

        /*String s1 = "Pragra"; //literal
        System.out.println(s1);

        String s2 = new String("Pragra"); // String is immutable? cannot e changed/ cannot update itself?

         */
        /*
        String s1 = "Pragra";
        System.out.println("PRAGRA " +s1);
        s1 = "Mouse";
        System.out.println("MOUSE " +s1);

         */
        String s1 = "Pragra";
        String s2 = "Pragra";
        String s3 = new String("Pragra");
        String s4 = new String("Pragra1");

        System.out.println(s1 == s2);//true checks the memory address - content / reference
        System.out.println(s1 == s3);// diff memory address / false
        System.out.println(s1.equals(s2)); // checks the content or value - true
        System.out.println(s1.equals(s3)); // true
        System.out.println(s3.equals(s4)); // false




    }
}

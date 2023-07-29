package July25;

public class StringMethods {
    public static void main(String[] args) {

        String s1 = "pragra";
        String s2 = "pragra";
        String s3 = "keyboard";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.concat(s2));
        System.out.println(s1.replace('A', 'P'));
        System.out.println(s1.contains("pragra"));
        System.out.println(s1.contentEquals("pragra"));

        System.out.println(s1.indexOf("a"));
        System.out.println(s1.isEmpty());
        System.out.println(s1.toUpperCase());
        System.out.println(s1.length());
        System.out.println(s1.lastIndexOf("a"));
        //p r a g r a
        System.out.println(s1.substring(3));

        //problem
        System.out.println(s1.replace("pr", "ni"));
        System.out.println(s1.trim());

        int num = 10;
        String s = String.valueOf(num);
        System.out.println((s + 10));


    }
}

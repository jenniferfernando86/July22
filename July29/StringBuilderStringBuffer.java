package July29;

public class StringBuilderStringBuffer {
    public static void main(String[] args) {
        //string bulider and string buffer
        String s = "pragra";
        String sNew = s.concat("Toronto");


        System.out.println(s);
        System.out.println(sNew);

        StringBuilder sb = new StringBuilder("pragra");
        sb.append(" Toronto");
        System.out.println(sb);

        StringBuffer stringBuffer = new StringBuffer("Microsoft");
        System.out.println(stringBuffer);
        stringBuffer.append("Toronto");
        System.out.println(stringBuffer);

    }
}

package July29;

import java.sql.SQLOutput;

public class ConstructorMain {

    public static void main(String[] args) {
        ConstructorClass cc = new ConstructorClass("Apple", "Mac");
        ConstructorClass cc1 = new ConstructorClass();
        cc1.name = "Lenova";
        cc1.os = "windows 11";
        System.out.println(cc.name+", "+ cc.os);
        System.out.println(cc1.name+", "+ cc1.os);
    }
}

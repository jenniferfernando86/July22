package aug15.innerDemo;

public class OuterMain {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        //OuterClassName.InnerClassName obj = outerObjectRef.new InnerClass();
        OuterClass.Inclass innerclassObj = outerClass.new Inclass();
        innerclassObj.insideMethod();
        innerclassObj.x = 10;

    }
}

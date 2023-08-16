package aug15.innerDemo;

public class Bottle {// outer class

    static class Water{// inner class
        public void color(){
            System.out.println("water has no color");
        }
    }

    static void test(){
        System.out.println();
    }
}
class MainT{
    public static void main(String[] args) {
        Bottle.Water water = new Bottle.Water();
        water.color();
        Bottle.test();
    }
}

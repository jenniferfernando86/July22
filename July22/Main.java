package July22;

public class Main {
    public static void main(String[] args) {

        Tesla t1 = new Tesla();
        t1.model = "Model X";
        t1.color = "black";
        t1.price = 60000;
        //t1.engineType = "Electric";

        Tesla t2 = new Tesla();
        t2.model = "Model Y";
        t2.color = "white";
        t2.price = 80000;
       // t2.engineType = "Electric";

        Tesla t3 = new Tesla();
        t3.model = "Model Z";
        t3.color = "Red";
        t3.price = 120000;
         t3.engineType = "Electric";

        t1.makeCar();
        t2.makeCar();
        t3.makeCar();



    }
}

package Aug5;

public class MainTest {
    public static void main(String[] args) {
    Chair chair = new Chair();
    chair.color = "Brown";
    chair.material = "Teak Wood";
    chair.price = 120;
    chair.numOfLegs = 4;

    chair.printDetails();
    chair.display();


    }
}

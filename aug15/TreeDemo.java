package aug15;

public class TreeDemo {
    public static void main(String[] args) {

        Furniture furniture = new Furniture() {
            @Override
            public void sit() {
                System.out.println("you can sit on a chair");
            }

            @Override
            public void stand() {

            }

            @Override
            public void nothing() {

            }
        };
        furniture.sit();
        furniture.stand();
        furniture.nothing();
    }
}

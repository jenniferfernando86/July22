package aug12.assignmentBird;

public class Pigeon extends Bird{

    @Override
    public void fly() {
        System.out.println("Pigeon will fly in low height");

    }

    @Override
    public void eat() {
        System.out.println("Pigeon eats pulses");

    }

    @Override
    public void drink() {
        System.out.println("Pigeon drinks water");

    }
}

package aug12.assignmentBird;

public class Eagle extends Bird {


    @Override
    public void fly() {
        System.out.println("Eagle can fly very high");
    }

    @Override
    public void eat() {
        System.out.println("Eagle preys on snakes and other animals");

    }

    @Override
    public void drink() {
        System.out.println("Eagle drinks water from river");

    }
}

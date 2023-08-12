package aug12.assignmentAnimal;

public class Lion implements Animal{

    @Override
    public void feed() {
        System.out.println("Feed : Lion feeds on deer");

    }

    @Override
    public void makeSound() {
        System.out.println("MakeSound: Lion Roars");

    }
}

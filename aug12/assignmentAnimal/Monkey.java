package aug12.assignmentAnimal;

public class Monkey implements ClimbableAnimal{
    @Override
    public void feed() {
        System.out.println("Feed: Monkey feeds on fruits and nuts");

    }

    @Override
    public void makeSound() {
        System.out.println("MakeSound: Chatter, whoop and screech are the sounds made by Monkey");

    }

    @Override
    public void climb() {
        System.out.println("Monkeys can climb and jump from one tree to another");

    }
}

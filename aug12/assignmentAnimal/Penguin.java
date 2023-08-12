package aug12.assignmentAnimal;

public class Penguin implements SwimmableAnimal{

    @Override
    public void feed() {
        System.out.println("Feed: Penguin feeds on small fishes");

    }

    @Override
    public void makeSound() {
        System.out.println("MakeSound: Penguins chirp");

    }

    @Override
    public void swim() {
        System.out.println("Penguins can swim in water and sea");

    }
}

package aug12.assignmentAnimal;

public class AnimalMain {
    public static void main(String[] args) {
        Lion lion = new Lion();
        System.out.println("Lion and its Behaviours");
        lion.feed();
        lion.makeSound();

        Penguin penguin = new Penguin();
        System.out.println("\nPenguin and its Behaviours");
        penguin.feed();
        penguin.makeSound();
        penguin.swim();

        Monkey monkey = new Monkey();
        System.out.println("\nMonkey and its Behaviours");
        monkey.feed();
        monkey.makeSound();
        monkey.climb();
    }
}

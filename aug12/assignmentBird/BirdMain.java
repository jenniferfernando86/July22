package aug12.assignmentBird;

public class BirdMain {
    public static void main(String[] args) {

        Pigeon pigeon = new Pigeon();
        pigeon.eat();
        pigeon.fly();
        pigeon.drink();

        Eagle eagle = new Eagle();
        eagle.eat();
        eagle.fly();
        eagle.drink();
        eagle.layEggs();

    }
}

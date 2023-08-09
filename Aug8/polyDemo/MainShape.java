package Aug8.polyDemo;

public class MainShape {

    public static void main(String[] args) {

        PolyDemoShape shape = new Rectangle(5,8);
        System.out.println("Area of Rectangle : " + shape.getArea());


        PolyDemoShape shape1 = new Circle(4);
        System.out.println("Area of Circle : " + shape1.getArea());
    }
}

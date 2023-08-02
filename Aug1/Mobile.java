package Aug1;


class MobileConstructor{

    private String brand;
    private int capacity;
    private String color;

    public MobileConstructor() {
        brand = "Apple";
        capacity = 129;
        color = "Black";

        System.out.println("This is printing from default constructor");
    }

    public MobileConstructor(String brand, int capacity, String color) {
        this();
        this.brand = brand;
        this.capacity = capacity;
        this.color = color;
    }

    public void printMobile(){
        System.out.println("BrandName : " + brand);
        System.out.println("Capacity : " + capacity);
        System.out.println("Color: " + color + "\n");
    }

}
public class Mobile {
    public static void main(String[] args) {
        MobileConstructor mobile = new MobileConstructor();
        mobile.printMobile();
    }
}

package July29;

    class CarGetter_Setter {
    private String name;
    private String engine;
    private String brand;
    private double price;

    public CarGetter_Setter(String name, String brand, double price, String engine) {
        this.name = name;
        this.engine = engine;
        this.price = price;
        // this.brand = brand;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {

        this.name = name;
    }

    private String getEngine() {


        return engine;
    }

    private void setEngine(String engine) {
        this.engine = engine;
    }

    private double getPrice() {
        return price;
    }

    private void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "name of car :" +getName() +"\n engine of car:"+ getEngine() + "\n prie of car:"+getPrice();
    }

        public static void main(String[] args) {
            System.out.println("car details1");
            CarGetter_Setter cgs = new CarGetter_Setter("Camry", "Toyota", 28000.00, "Automatic");
            System.out.println(cgs.toString());

        }


}

/*
public class CarDemo{
    public static void main(String[] args) {

            CarGetter_Setter cgs = new CarGetter_Setter("Camry", "Toyota", 28000.00, "Automatic");
            System.out.println(cgs.name);
        System.out.println("car details1");
    }
}*/

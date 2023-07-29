package July29;

class ClassCar {

    private String name;
    private String brand;
    private String engine;
    private String type;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getEngine() {
        return engine;
    }

    public static void main(String[] args) {
        ClassCar honda = new ClassCar();
        honda.setBrand("Honda");
        honda.setName("Civic");
        honda.setEngine("Automatic");

        System.out.println(honda.getBrand());
        System.out.println(honda.getName());
        System.out.println(honda.getEngine());
    }

}

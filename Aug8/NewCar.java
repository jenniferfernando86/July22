package Aug8;

public class NewCar extends NewVehicle{

    int fuelCap = 50;

    public void displayVehicle() {
        System.out.println("this is from new car class");
    }
    public void display(){
        super.displayVehicle();
        System.out.println("Fuel capacity for the newVehicle class " + super.fuelCap);
        System.out.println("Fuel capacity for the newVehicle class " + fuelCap);
    }
}

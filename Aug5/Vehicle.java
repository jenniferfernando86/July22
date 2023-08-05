package Aug5;

class Vehicle {
    String color;
    String transmission;

    String bodyType;


    public Vehicle(String color, String transmission, String bodyType) {
        this.color = color;
        this.transmission = transmission;
        this.bodyType = bodyType;
    }
}
    class Car extends Vehicle {

    int seats;
    int numOfDoors;

        public Car(String color, String transmission, String bodyType, int seats, int numOfDoors) {
            super(color, transmission, bodyType);
            this.seats = seats;
            this.numOfDoors = numOfDoors;
            super.color = "red";
        }
        public void printDetails() {
            System.out.println("Details of the car :");
            System.out.println("Color : " + super.color);
            System.out.println("BodyType : " + bodyType);
            System.out.println("Transmission : " + transmission);
            System.out.println("Seats : " + seats);
            System.out.println("No. Of Doors : " + numOfDoors);
        }
    }

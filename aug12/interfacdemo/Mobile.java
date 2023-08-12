package aug12.interfacdemo;

public class Mobile implements Telephone, Camera, Computer{


    @Override
    public void takePictures() {
        System.out.println("This will take pictures");

    }

    @Override
    public void shootVideos() {
        System.out.println("This can shoot Videos");

    }

    @Override
    public void calculate() {
        System.out.println("This can calculate");

    }

    @Override
    public void games() {
        System.out.println("This can play games");

    }

    @Override
    public void programming() {
        System.out.println("This can do programming");

    }

    @Override
    public void makeCalls() {
        System.out.println("This can make calls");

    }

    @Override
    public void receiveCalls() {
        System.out.println("This can receive calls");

    }
}

package aug12.interfacdemo;

public class MobileMain {
    public static void main(String[] args) {

        System.out.println("Features of Mobile : ");

        Mobile mobile = new Mobile();

        mobile.calculate();
        mobile.games();
        mobile.makeCalls();
        mobile.receiveCalls();
        mobile.takePictures();
        mobile.shootVideos();
    }
}

package aug15.innerDemo.Mobile;

import java.util.Scanner;
public class Mobile {

    public void call(){
        System.out.println("Calling");
    }
    class Screen{
        public void show(){
            System.out.println("Display on the screen");
        }
    }
}
class Maintest{
    public static void main(String[] args) {
        Mobile mobile = new Mobile();

        Mobile.Screen screen = mobile.new Screen();
        screen.show();
        mobile.call();
    }
}

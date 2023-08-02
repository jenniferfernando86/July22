package Aug1;

class DateDemo{
    private int day;
    private int month;
    private int year;

    DateDemo(){
        day = 1;
        month = 8;
        year = 2023;
    }
    public void printDate(){
        System.out.println("Date : " + day + "/" + month + "/ "+ year);
    }
}

public class Constructor {
    // constructor is used to iniialize object?
    //same as name as class name
    //no return type ---> not even void
    // type --- default --and parameteized
    //no final or static
    // can a constructor be private?
    //singleton class -

    public static void main(String[] args) {
        DateDemo dateDemo = new DateDemo();// to create object
        dateDemo.printDate();// this will print some default values
    }
}

package Aug1;

class StudentDemo{
    private String name;
    private int id;
    private String section;

    StudentDemo(){
        name = "Jennifer";
        id = 404;
        section = "A";
    }

    public StudentDemo(String name, int id, String section) {
        this.name = name;
        this.id = id;
        this.section = section;
    }

    public StudentDemo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public StudentDemo(String name) {
        this.name = name;
    }

    public void printData(){
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
        System.out.println("Section: " + section + "\n");
    }
}

public class StudentConstructor {
    public static void main(String[] args) {
        StudentDemo studentDemo = new StudentDemo();
        studentDemo.printData();

        StudentDemo studentDemo1 = new StudentDemo("Jerusha", 405, "B");
        studentDemo1.printData();

        StudentDemo studentDemo2 = new StudentDemo("Jessica", 406);
        studentDemo2.printData();

        StudentDemo studentDemo3 = new StudentDemo("Ria");
        studentDemo3.printData();


    }
}
//Java11 , jshell
// 17 --> changes in switch case
// record
package July29;
/*
access modifier

private
public
protected
default
for usage of passwords it has to be encrypted so in programming we try to make the concepts private which deals with day
to day examples
 */


class Student{
    //properties of student -- boiler plate
    public int id;
    public String name;
    public String username;
    public String password;

    //this --refers to the current class object / instance variables

    public void setId(int id) {//local variable
        this.id = id;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getId() {
        return id;

    }

    public String getName() {
        return name;
    }
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.id = 101;
        student.name = "Matt";

        System.out.println(student.id);
        System.out.println(student.name);

        student.id = 102;
        System.out.println(student.id);

        System.out.println(student.password);
        student.password = "dkafagg";
        System.out.println(student.password);

    }

}

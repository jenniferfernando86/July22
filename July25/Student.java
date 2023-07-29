package July25;

public class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.age = 15;
        student.name = "Peter";
        System.out.println((student));
    }
}

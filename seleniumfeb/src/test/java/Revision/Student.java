package Revision;
public class Student {

    String name;
    int age;
    String course;

    public Student() {
        name = "Unknown";
        age = 0;
        course = "None";
    }

    public Student(String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {

        Student d = new Student();
        Student f = new Student("Srilekha", 27, "maths");

        d.displayInfo();
        f.displayInfo();
    }
}
class Pen {
    String color;
    String type;
    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor() {
        System.out.println(this.color);
    }
}
class Student {
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
public class OOPS {

    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color ="blue";
        // pen1.type ="gel";

        // Pen pen2 = new Pen();
        // pen2.color ="black";
        // pen2.type ="ballponit";


        // pen1.printColor();
        // pen2.printColor();
        Student s1 = new Student(); // student = COnstructor 
        s1.name = "Gizala";
        s1.age = 90;

        s1.printInfo();
    }
    
}

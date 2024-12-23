public class StudentClass {
    //creating a new data type

    // public static void func(Student x) {
    //     System.out.println(x.name);
    //     return;
    // }
    // public static void change(int x) {
    //     x = 7;
    //     return;
        
    // }
    public static void main(String[] args) {

        class Student {
            String name;
            int rno;
            double percent;
        }
        Student s1 = new Student();
        s1.name ="Gizala";
        s1.rno = 45;
        s1.percent =94.4;
        System.out.println(s1.name);
        s1.name ="rahul";

        // int x = 5;
        // System.out.println(x);
        // change(x);
    }

}
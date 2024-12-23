

public class Arrays {

    public static void main(String[] args) {

        //int[] marks = new int[5];
    //     int [] marks;
    //     marks = new int[5];
    //     marks[0] = 100;
    //     marks[1] = 90;
    //     marks[2] = 80;
    //     marks[3] = 40;
    //     marks[4] = 10;
    //    // marks[4] = 55 throws an error
    // //     System.out.println(marks[4]);
    //     float [] marks = {98.5f, 45.5f ,79.5f , 99.5f ,80.4f};
    //     System.out.println(marks.length);
    //     System.out.println(marks[2]);
    //     String [] students = {"Harry", "Reehan","Shubham","gizala"};
    //     System.out.println(students.length);
    //     System.out.println(students[2]);


        // displaying the array (Naive way)
        int [] marks ={68,56,89,45,50};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);


        //Displaying the array (for loop);
        System.out.println("Printing using for loop");
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for loop");
        for(int i = marks.length-1;i>=0;i--){
            System.out.println(marks[i]);
        }
        System.out.println("Printing using for-each loop");

        for(int element :marks){
            System.out.println(element);
        }







    }
    
    
}

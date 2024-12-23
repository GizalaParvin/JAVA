
import java.util.Scanner;

public class PracticeSet {
    public static void main(String[] args) {
        int a = 10;
        if(a ==11){
            System.out.println("I am 11");

        }
        else{
            System.out.println("I am not 11");
        }

        //question 2
        byte m1, m2 , m3;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your marks in Physiscs");
        m1 = sc.nextByte();

        System.out.println("Enter your marks in English");
        m2 = sc.nextByte();

        System.out.println("Enter your marks in Maths");
        m3 = sc.nextByte();
        
        float avg =(m1 + m2 + m3)/3.0f;
        System.out.println("You Overall Percentage is:" + avg);
        if(avg>=48 && m1>=33 && m2>=33 && m3>=33){
            System.out.println("Congratulation! you have been Protected ");

        }
        else{
            System.out.println("Sorry,You have not been promoted Please try again ");
        }
    }
    
}

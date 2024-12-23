
import java.util.Scanner;
//import javax.sound.sampled.SourceDataLine;

public class Else {
    public static void main(String[] args) {
        int age;
        
        System.out.println("Enter your age:");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();


        switch(age){
            case 18:
                System.out.println("You are going to become an adult!");
                break;
            case 21:
                System.out.println("You are going to become an adult!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("thanks for using my java Code!");
        /*if (age>56){
            System.out.println("You are experieance");

        }
        else if(age>46){
            System.out.println("You are semi-experienced");

        }
        else if(age>36){
            System.out.println("YOu are semi semi experienced");
        }
        else{
            System.out.println("You are not experienced");*/
        }

    }
    


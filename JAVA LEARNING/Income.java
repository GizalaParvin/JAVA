
import java.util.Scanner;

public class Income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your income in Lakhs");


        float tax = 0;
        float income = sc.nextFloat();
        if(income<2.5){
            tax = tax + 0;
        }

        else if(income>2.5f && income<5f){
            tax = tax + 0.05f * (income - 2.5f);

        }

        else if(income >5f && income < 10.f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.3f * (income - 5f);

        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.3f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee: "+ tax);

        // // Question 4
        // Scanner sc = new Scanner(System.in);
        // int day = sc.nextInt();
        
        
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("THURsday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
      


    }
    
}

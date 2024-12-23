import java.util.Scanner;

public class Year{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String website = sc.next();

        if(website.endsWith(".org")){
            System.out.println("This is an organisational Website");

        }
        else if(website.endsWith(".com")){
            System.out.println("This is an Commercial Website");

        }
        else if(website.endsWith(".in")){
            System.out.println("This is an indain Website");

        }

          

        
    }
    
}

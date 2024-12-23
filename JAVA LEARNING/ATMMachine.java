
// import com.sun.jdi.PathSearchingVirtualMachine;
// import java.util.Scanner;

// public class ATMMachine {
//     class ATM{
//         float balance;
//         int PIN = 5674;

//         public void checkpin(){
//             System.out.println("Enter your pin:");
//             Scanner sc = new Scanner(System.in);
//             int enterdpin = sc.nextInt();
//             if(enterdpin==PIN){
//                 menu();
//             }
//             else{
//                 System.out.println("Enter a valid Pin");
//             }

//         }
//         public void menu(){
//             System.out.println("Enter your Choice: ");
//             System.out.println("1. Check A/C Balance");
//             System.out.println("2.Withdraw Money");
//             System.out.println("3.Deposit Money");
//             System.out.println("4.Exit");

//             Scanner sc = new Scanner(System.in);
//             int opt = sc.nextInt();

//             if(opt==1){
//                 checkBalance();

//             }
//             else if(opt==2){
//                 withdrawMoney();
//             }
//             else if(opt==3){
//                 depositMoney();

//             }
//             else if(opt==4){
//                 return;
                
//             }
//         }
//         public void checkBalance(){
//             System.out.println("Balance"+ balance);
//             menu();
//         }
//         public void withdraw(){
//             System.out.println("enter amout to withdraw");
//             Scanner sc = new Scanner(System.in);
//             float amount = sc.nextFloat();
//             if(amount>balance){
//                 System.out.println("Insufficient Balance");
//             }
//             else{
//                 balance = balance - amount;
//                 System.out.println("Money Withdraw Successful");
//             }
//             menu();
//         }

//         public void depositMoney(){
//             System.out.println("Enter the Amount: ");
//             Scanner sc = new Scanner(System.in);
//             float amount =sc.nextFloat();
//             balance = balance + amount;
//             System.out.println("Money Deposited Successfully");
             
                
//             }
//         }
            
 

    
//     public static void main(String[] args) {
//         ATMMachine obj = new ATMMachine();

//         obj.checkpin();
        

        
//     }
// }




import java.util.Scanner;

public class ATMMachine {
    class ATM {
        float balance;
        int PIN = 5674;

        public void checkpin() {
            System.out.println("Enter your pin:");
            Scanner sc = new Scanner(System.in);
            int enterdpin = sc.nextInt();
            if (enterdpin == PIN) {
                menu();
            } else {
                System.out.println("Enter a valid Pin");
            }
        }

        public void menu() {
            System.out.println("Enter your Choice: ");
            System.out.println("1. Check A/C Balance");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Deposit Money");
            System.out.println("4. Exit");

            Scanner sc = new Scanner(System.in);
            int opt = sc.nextInt();

            if (opt == 1) {
                checkBalance();
            } else if (opt == 2) {
                withdrawMoney();
            } else if (opt == 3) {
                depositMoney();
            } else if (opt == 4) {
                return;
            }
        }

        public void checkBalance() {
            System.out.println("Balance: " + balance);
            menu();
        }

        public void withdrawMoney() {
            System.out.println("Enter amount to withdraw:");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            if (amount > balance) {
                System.out.println("Insufficient Balance");
            } else {
                balance = balance - amount;
                System.out.println("Money Withdraw Successful");
            }
            menu();
        }

        public void depositMoney() {
            System.out.println("Enter the Amount: ");
            Scanner sc = new Scanner(System.in);
            float amount = sc.nextFloat();
            balance = balance + amount;
            System.out.println("Money Deposited Successfully");
            menu();
        }
    }

    public static void main(String[] args) {
        ATMMachine machine = new ATMMachine();
        ATM atm = machine.new ATM();
        atm.checkpin();
    }
}

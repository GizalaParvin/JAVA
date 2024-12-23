import java.util.InputMismatchException;
import java.util.Scanner;

public class AtmSimulation{
    private static double balance = 1000.00; // Initial balance
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        while (true) {
            System.out.println("Welcome to the ATM");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            try {
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        depositMoney(scanner);
                        break;
                    case 3:
                        withdrawMoney(scanner);
                        break;
                    case 4:
                        System.out.println("Thank you for using the ATM. Goodbye!");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear the invalid input
            }
        }
    }

    public static void checkBalance() {
        System.out.printf("Your current balance is: $%.2f%n", balance);
    }

    public static void depositMoney(Scanner scanner) {
        System.out.print("Enter amount to deposit: ");
        try {
            double amount = scanner.nextDouble();
            if (amount > 0) {
                balance += amount;
                System.out.printf("You have successfully deposited $%.2f. Your new balance is $%.2f%n", amount, balance);
            } else {
                System.out.println("Invalid amount. Please try again.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid amount.");
            scanner.next(); // Clear the invalid input
        }
    }

    public static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter amount to withdraw: ");
        try {
            double amount = scanner.nextDouble();
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.printf("You have successfully withdrawn $%.2f. Your new balance is $%.2f%n", amount, balance);
            } else if (amount > balance) {
                System.out.println("Insufficient balance. Please try again.");
            } else {
                System.out.println("Invalid amount. Please try again.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid amount.");
            scanner.next(); // Clear the invalid input
        }
    }
}

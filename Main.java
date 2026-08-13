import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("=== Banking System ===");
        System.out.println("1. Create Account");
        System.out.println("2. Deposit");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Account Number: ");
            int no = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Initial Balance: ");
            double bal = sc.nextDouble();

            Account a = new Account(no, name, bal);
            bank.create(a);
        }

        System.out.println("\n--- Deposit Money ---");
        System.out.print("Account Number: ");
        int no = sc.nextInt();

        System.out.print("Deposit Amount: ");
        double amt = sc.nextDouble();

        bank.deposit(no, amt);

        sc.close();
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        int choice;

        do {
            System.out.println("\n===== BANK MANAGEMENT SYSTEM =====");
            System.out.println("1.Create Account");
            System.out.println("2.Deposit");
            System.out.println("3.Withdraw");
            System.out.println("4.Check Balance");
            System.out.println("5.Exit");
            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Account No: ");
                    int no = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Initial Balance: ");
                    double bal = sc.nextDouble();
                    bank.createAccount(no, name, bal);
                    break;

                case 2:
                    if (bank.accountExists()) {
                        System.out.print("Deposit Amount: ");
                        bank.deposit(sc.nextDouble());
                    }
                    break;

                case 3:
                    if (bank.accountExists()) {
                        System.out.print("Withdraw Amount: ");
                        bank.withdraw(sc.nextDouble());
                    }
                    break;

                case 4:
                    if (bank.accountExists())
                        bank.checkBalance();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
public class Main {
    public static void main(String[] args) {

        Bank b = new Bank();

        b.create(101, "Rashmi", 5000);

        System.out.println("=== BANKING SYSTEM ===");
        System.out.println("Account Created");
        System.out.println("Name : Rashmi");
        System.out.println("Balance : 5000");

        System.out.println("\nWithdraw 2000");
        b.withdraw(101, 2000);
    }
}
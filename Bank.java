public class Bank {

    Account acc;

    void createAccount(int no, String name, double bal) {
        acc = new Account(no, name, bal);
        System.out.println("Account Created Successfully");
    }

    void deposit(double amt) {
        acc.deposit(amt);
    }

    void withdraw(double amt) {
        acc.withdraw(amt);
    }

    void checkBalance() {
        acc.display();
    }

    boolean accountExists() {
        if (acc == null) {
            System.out.println("Create Account First");
            return false;
        }
        return true;
    }
}
import java.util.HashMap;

public class Bank {
    HashMap<Integer, Account> accounts = new HashMap<>();

    void create(Account a) {
        accounts.put(a.accNo, a);
        System.out.println("Account Created!");
    }

    void deposit(int no, double amt) {
        Account a = accounts.get(no);
        if (a != null) {
            a.balance += amt;
            System.out.println("Deposit Successful!");
            System.out.println("Balance: " + a.balance);
        } else {
            System.out.println("Account Not Found");
        }
    }
}
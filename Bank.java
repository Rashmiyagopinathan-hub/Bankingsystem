import java.util.HashMap;

public class Bank {
    HashMap<Integer, Account> map = new HashMap<>();

    void create(int accNo, String name, int bal) {
        map.put(accNo, new Account(name, bal));
    }

    void withdraw(int accNo, int amt) {
        Account a = map.get(accNo);
        if (a != null && a.balance >= amt) {
            a.balance -= amt;
            System.out.println("Withdraw: " + amt);
            System.out.println("Balance: " + a.balance);
        } else System.out.println("Insufficient Balance");
    }
}
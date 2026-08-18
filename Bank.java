import java.util.HashMap;

public class Bank {
    HashMap<Integer, Account> map = new HashMap<>();

    void create(int no, String name, int bal) {
        map.put(no, new Account(name, bal));
    }

    void display(int no) {
        Account a = map.get(no);
        System.out.println("Account No: " + no);
        System.out.println("Name: " + a.name);
        System.out.println("Balance: " + a.balance);
    }
}
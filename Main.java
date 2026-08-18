import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Bank b = new Bank();

        b.create(101, "Rashmi", 5000);

        while (true) {
            System.out.println("\n=== BANKING SYSTEM ===");
            System.out.println("1. Display");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");

            int choice = input.nextInt();

            if (choice == 1) {
                b.display(101);
            } else if (choice == 2) {
                System.out.println("Thank you!");
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        input.close();
    }
}
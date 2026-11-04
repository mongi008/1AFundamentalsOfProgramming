import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class looping3Buff {
    public static void main(String[] args) {


            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            double balance = 20000.00;
            double amount = 0;

            try{


            System.out.println(" Mucho Dinero's Savings Account ");
            System.out.printf("Starting balance: P%,.2f%n", balance);
            System.out.println("Initial Balance: Php" + balance);

            do {
                System.out.print("\nEnter amount (0 to stop): ");
                amount = Double.parseDouble(input.readLine());

                if (amount > 0) {
                    balance += amount;
                    System.out.println("Deposit: Php " + amount);
                }
                else if (amount < 0) {

                    if (Math.abs(amount) <= balance) {
                        balance += amount;
                        System.out.println("Withdrawal: Php " + Math.abs(amount));
                    }
                    else {
                        System.out.println("INSUFFICIENT FUNDS!");
                    }
                }

                if (amount != 0) {
                    System.out.printf("Outstanding Balance: P%.2f%n", balance);
                }

            } while (amount != 0);

                System.out.printf("Total balance: P%,.2f%n", balance);

        } catch (IOException e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}
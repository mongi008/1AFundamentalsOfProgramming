import javax.print.attribute.standard.NumberUp;
import javax.swing.JOptionPane;

public class looping3JOp {
    public static void main(String[] args) {

        double balance = 20000.00;
        double amount;
        String output = "";

        output += "Initial Balance: Php " + balance + "\n";

        do {
            amount = Double.parseDouble(JOptionPane.showInputDialog(
                    "Current Balance: Php " + balance +
                            "\nEnter amount (0 to stop)"));

            if (amount > 0) {
                balance += amount;
                output += "\nDeposit: Php " + amount;
                output += "\nOutstanding Balance: Php " + balance + "\n";

            } else if (amount < 0) {

                if (Math.abs(amount) <= balance) {
                    balance += amount;
                    output += "\nWithdrawal: Php " + Math.abs(amount);
                    output += "\nOutstanding Balance: Php " + balance + "\n";
                } else {
                    output += "\nINSUFFICIENT FUNDS!";
                    output += "\nOutstanding Balance: Php " + balance + "\n";
                }
            }

        } while (amount != 0);
        output += "\nfianl Balance: Php " + balance;

        JOptionPane.showMessageDialog(null, output);
    }
}


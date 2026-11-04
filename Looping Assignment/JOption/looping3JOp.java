import javax.swing.JOptionPane;

public class looping3JOp {

    public static void main(String[] args) {

        try {
            double balance = 20000.00;
            double amount = 0;

            do {
                String prompt = String.format(" Current Balance: P%,.2f \n Enter a positive amount to deposit" +
                        "\n Enter a negative amount to withdraw, or 0 to exit \n Enter amount: ", balance);
                amount = Double.parseDouble(JOptionPane.showInputDialog(null, prompt, "Mucho Dinero's Savings Account", JOptionPane.QUESTION_MESSAGE));

                if (amount > 0) {
                    balance += amount;
                    JOptionPane.showMessageDialog(null, String.format("Deposit successful: P%,.2f%nNew Balance: P%,.2f", amount, balance), "Deposit", JOptionPane.INFORMATION_MESSAGE);
                } else if (amount < 0) {
                    if (Math.abs(amount) <= balance) {
                        balance += amount;
                        JOptionPane.showMessageDialog(null, String.format("Withdrawal successful: P%,.2f%nRemaining Balance: P%,.2f", Math.abs(amount), balance), "Withdrawal", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Insufficient Balance!", "Withdrawal", JOptionPane.WARNING_MESSAGE);
                    }
                }
            } while (amount != 0);

            JOptionPane.showMessageDialog(null, String.format("Your final balance is: P%,.2f", balance), "Transaction Complete", JOptionPane.INFORMATION_MESSAGE);

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Please enter a valid number!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
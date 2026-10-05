// JOptionPane lets us show pop-up windows
import javax.swing.JOptionPane;

public class Assignment2JOp {

    public static void main(String[] args) {


        String rateText = JOptionPane.showInputDialog("Enter hourly pay rate:");

        String hoursText = JOptionPane.showInputDialog("Enter hours worked:");

        double rate = Double.parseDouble(rateText);
        double hours = Double.parseDouble(hoursText);

        // Gross pay = hours times rate
        double grossPay = hours * rate;

        // This will hold the withholding percent (10, 12, 15, or 20)
        double percent;

        // Pick the percent based on the gross pay
        if (grossPay <= 2000) {
            percent = 10;
        } else if (grossPay <= 4000) {
            percent = 12;
        } else if (grossPay <= 10000) {
            percent = 15;
        } else {
            percent = 20;
        }

        // Withholding tax = a percent of the gross pay
        double tax = grossPay * (percent / 100);

        // Net pay = gross pay minus the tax
        double netPay = grossPay - tax;

        // Build the message to show (%.2f means show 2 decimal places)
        String message = String.format(
                "Gross Pay: Php %.2f\nWithholding Tax: Php %.2f (%.0f%%)\nNet Pay: Php %.2f",
                grossPay, tax, percent, netPay);

        // Show the answer in a pop-up
        JOptionPane.showMessageDialog(null, message);
    }
}
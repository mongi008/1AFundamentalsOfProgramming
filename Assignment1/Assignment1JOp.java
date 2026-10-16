// JOptionPane lets us show pop-up windows
import javax.swing.JOptionPane;

public class Assignment1JOp {

    public static void main(String[] args) {

        String input = JOptionPane.showInputDialog("Enter a year:");

        int year = Integer.parseInt(input);

        String message;

        if (year % 400 == 0) {
            // Divisible by 400 = leap year (like 2000)
            message = year + " is a leap year.";
        } else if (year % 100 == 0) {
            // Divisible by 100 but not 400 = NOT a leap year (like 1900)
            message = year + " is not a leap year.";
        } else if (year % 4 == 0) {
            // Divisible by 4 (and not by 100) = leap year (like 2024)
            message = year + " is a leap year.";
        } else {
            // Everything else is not a leap year (like 2023)
            message = year + " is not a leap year.";
        }

        // Show the answer in another pop-up
        JOptionPane.showMessageDialog(null, message);
    }
}
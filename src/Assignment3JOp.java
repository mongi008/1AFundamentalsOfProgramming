import javax.swing.JOptionPane;

public class Assignment3JOp {
    public static void main(String[] args) {
        double nsat = Double.parseDouble(
                JOptionPane.showInputDialog("Enter NSAT score:"));
        double salary = Double.parseDouble(
                JOptionPane.showInputDialog("Enter parents' monthly salary:"));
        double exam = Double.parseDouble(
                JOptionPane.showInputDialog("Enter entrance exam score:"));


        // Average of NSAT and entrance exam scores
        double average = (nsat + exam) / 2;
        String result;

        // Rejected if any one of the rejection conditions is true
        if (salary > 10000 || nsat < 90 || exam < 85) {
            result = "Rejected";
        }
        // Accepted only if all acceptance conditions are met
        else if (salary <= 3500 && average >= 91) {
            result = "Accepted";
        }
        // Neither accepted nor rejected
        else {
            result = "For further study";
        }

        // Show the result in a message dialog
        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
}

import javax.swing.JOptionPane;

public class Assignment4JOp {
    public static void main(String[] args) {
        // Ask for the applicant's details using input dialogs
        double height = Double.parseDouble(
                JOptionPane.showInputDialog("Enter height (cm):"));
        int age = Integer.parseInt(
                JOptionPane.showInputDialog("Enter age:"));
        String citizenship = JOptionPane.showInputDialog(
                        "Enter citizenship code (C = citizen of Endor, N = non-citizen):")
                .trim().toUpperCase();
        String recommendee = JOptionPane.showInputDialog(
                        "Enter recommendee code (R = recommendee, N = non-recommendee):")
                .trim().toUpperCase();

        String result;

        // Recommendees of Obi Wan are accepted automatically
        if (recommendee.equals("R")) {
            result = "Accepted";
        }
        // Others must meet all requirements: height, age range and citizenship
        else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C")) {
            result = "Accepted";
        }
        // Everyone else is rejected
        else {
            result = "Rejected";
        }

        // Show the result in a message dialog
        JOptionPane.showMessageDialog(null, "Result: " + result);
    }
}
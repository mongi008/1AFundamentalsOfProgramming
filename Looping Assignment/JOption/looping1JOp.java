import javax.swing.JOptionPane;

public class looping1JOp {
    public static void main(String[] args) {

        int number;
        int highest;
        int lowest;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter Number: "));

        highest = number;
        lowest = number;

        for (int a = 1; a < 10; a++) {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter Number: " + a));

            if (number > highest) {
                highest = number;
            }

            if (number < lowest) {
                lowest = number;
            }
        }

        JOptionPane.showMessageDialog(null, "Highest Number: " + highest + "\nLowest Number: " + lowest);
    }
}
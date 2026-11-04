import javax.swing.JOptionPane;

public class looping2JOp {
    public static void main(String[] args) {

        int a;
        String output = "";

        for (a = 2; a <= 100; a += 2) {
            output += a + " ";

            if (a % 20 == 0) {
                output += '\n';
            }
        }

        JOptionPane.showMessageDialog(null, output);
    }
}
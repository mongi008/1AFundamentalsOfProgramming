import javax.swing.JOptionPane;
public class quiz2floating {
    public static void main(String[] args) {

        String msg = "Welcome to Adobo Cooking Show";
        JOptionPane.showMessageDialog(null, msg);

        String name = "";
        name = JOptionPane.showInputDialog("Please enter your name");

        String kg = "";
        double amount = Double.parseDouble(
                JOptionPane.showInputDialog("How many kilo of Pork will you cook?")
        );

        double ratioOfSoySauce = 0.5 * amount;
        double ratioOfVinegar = 0.3333333333 * amount;

        String msgs = "The ratio of soy sauce for " + amount +
                " kg is = " + ratioOfSoySauce;

        String ratio = "The ratio of vinegar for " + amount +
                " kg is = " + ratioOfVinegar;

        JOptionPane.showMessageDialog(null, msgs);
        JOptionPane.showMessageDialog(null, ratio);
    }
}

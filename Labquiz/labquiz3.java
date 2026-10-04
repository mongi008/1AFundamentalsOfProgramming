import javax.swing.JOptionPane;

public class labquiz3 {
    public static void main(String[] args) {

        String msg = "salary calculator";
        JOptionPane.showMessageDialog(null, msg);

        String Input = "";
        Input = JOptionPane.showInputDialog("Salary Calculator");

        double oldsalary = Double.parseDouble(Input);
        double increase = oldsalary * 0.1775;

        double newsalary = oldsalary + increase;
        double retroactivepay = increase * 2;

        JOptionPane.showMessageDialog(null,
                "new salary:" + newsalary +
                        "\nRetroactive pay:" + retroactivepay);
    }
}
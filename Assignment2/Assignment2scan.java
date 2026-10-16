// Scanner lets us read what the user types
import java.util.Scanner;

public class Assignment2scan {

    public static void main(String[] args) {

        // This is our scanner, it grabs whatever the user types
        Scanner sc = new Scanner(System.in);

        // Ask for the hourly pay rate (nextDouble reads a number with decimals)
        System.out.print("Enter hourly pay rate: ");
        double rate = sc.nextDouble();

        // Ask for the hours worked
        System.out.print("Enter hours worked: ");
        double hours = sc.nextDouble();

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

        // Show everything (%.2f means show 2 decimal places)
        System.out.println();
        System.out.printf("Gross Pay:        Php %.2f%n", grossPay);
        System.out.printf("Withholding Tax:  Php %.2f (%.0f%%)%n", tax, percent);
        System.out.printf("Net Pay:          Php %.2f%n", netPay);

        // Close the scanner when we're done
        sc.close();
    }
}
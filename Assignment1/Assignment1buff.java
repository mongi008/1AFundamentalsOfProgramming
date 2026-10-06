import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment1buff {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Enter a year: ");
            int year = Integer.parseInt(br.readLine().trim());

            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

            if (isLeap) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a whole number for the year.");
        } catch (IOException e) {
            System.out.println("An error occurred while reading input.");
        }
    }
}
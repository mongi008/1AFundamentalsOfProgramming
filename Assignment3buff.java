import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment3buff {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask for the three figures and convert each input to a number
        System.out.print("Enter NSAT score: ");
        double nsat = Double.parseDouble(br.readLine());

        System.out.print("Enter parents' monthly salary: ");
        double salary = Double.parseDouble(br.readLine());

        System.out.print("Enter entrance exam score: ");
        double exam = Double.parseDouble(br.readLine());

        // Average of NSAT and entrance exam scores
        double average = (nsat + exam) / 2;

        // Rejected if any one of the rejection conditions is true
        if (salary > 10000 || nsat < 90 || exam < 85) {
            System.out.println("Rejected");
        }
        // Accepted only if all acceptance conditions are met
        else if (salary <= 3500 && average >= 91) {
            System.out.println("Accepted");
        }
        // Neither accepted nor rejected
        else {
            System.out.println("For further study");
        }
    }
}
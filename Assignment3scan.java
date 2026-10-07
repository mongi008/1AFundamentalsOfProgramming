import java.util.Scanner;

public class Assignment3scan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for the three figures
        System.out.print("Enter NSAT score: ");
        double nsat = sc.nextDouble();

        System.out.print("Enter parents' monthly salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter entrance exam score: ");
        double exam = sc.nextDouble();

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

        // Close the Scanner when done
        sc.close();
    }
}
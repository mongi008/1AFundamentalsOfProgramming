import java.util.Scanner;

public class Assignment4Scan {
    public static void main(String[] args) {
        // Create a Scanner to read input from the keyboard
        Scanner sc = new Scanner(System.in);

        // Ask for the applicant's details
        System.out.print("Enter height (cm): ");
        double height = sc.nextDouble();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter citizenship code (C = citizen of Endor, N = non-citizen): ");
        String citizenship = sc.next().toUpperCase();

        System.out.print("Enter recommendee code (R = recommendee, N = non-recommendee): ");
        String recommendee = sc.next().toUpperCase();

        // Recommendees of Obi Wan are accepted automatically
        if (recommendee.equals("R")) {
            System.out.println("Accepted");
        }
        // Others must meet all requirements: height, age range and citizenship
        else if (height >= 200 && age >= 21 && age <= 25 && citizenship.equals("C")) {
            System.out.println("Accepted");
        }
        // Everyone else is rejected
        else {
            System.out.println("Rejected");
        }

        // Close the Scanner when done
        sc.close();
    }
}
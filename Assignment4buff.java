import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Assignment4buff {
    public static void main(String[] args) throws IOException {
        // Create a BufferedReader to read input from the keyboard
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // Ask for the applicant's details
        System.out.print("Enter height (cm): ");
        double height = Double.parseDouble(br.readLine());

        System.out.print("Enter age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.print("Enter citizenship code (C = citizen of Endor, N = non-citizen): ");
        String citizenship = br.readLine().trim().toUpperCase();

        System.out.print("Enter recommendee code (R = recommendee, N = non-recommendee): ");
        String recommendee = br.readLine().trim().toUpperCase();

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
    }
}
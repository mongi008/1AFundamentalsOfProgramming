import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class FifthJava {
    public static void main(String[] args) throws IOException {

        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter your age:");
            String ageInput = dataIn.readLine();
            int age = Integer.parseInt(ageInput);

            System.out.print("Enter your exact height in meters:");
            String heightInput = dataIn.readLine();
            double height = Double.parseDouble(heightInput);

            System.out.println("you are " + age + "years old and " + height + "m tall");

        } catch (IOException e) {
            System.err.println("error reading input stream.");
        } catch (NumberFormatException e) {
            System.err.println("invalid number format! Please enter igits only");
        }
    }
}
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class looping1Buff {
    public static void main(String[] args) throws IOException {

        try {

            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

            int numb;
            int highest;
            int lowest;

            System.out.println("Enter 10 Numbers: ");


            numb = Integer.parseInt(input.readLine());
            highest = numb;
            lowest = numb;

            for (int a = 1; a < 10; a++) {
                numb = Integer.parseInt(input.readLine());

                if (numb > highest) {
                    highest = numb;
                }

                if (numb < lowest) {
                    lowest = numb;
                }
            }

            System.out.println("Highest Number: " + highest);
            System.out.println("Lowest Number: " + lowest);


        } catch (IOException e) {
            System.out.println("Input Error: " );


        }
    }
}



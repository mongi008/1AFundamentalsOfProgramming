import java.util.Scanner;

public class quiz2scanner {
    public static void main(String[] args){

        Scanner adobo = new Scanner(System.in);
        String name;
        double kg;

        System.out.println("Welcome to Adobo Cooking Show");
        System.out.print("Enter your name: ");
        name = adobo.nextLine();

        System.out.println("How many kilo of pork will you cook?");
        kg = adobo.nextDouble();

        double ratioOfSoySauce = 0.5 / kg;
        double ratioOfVinegar = 0.3 / kg;

        System.out.println("The ratio of soy sauce for 1.5 kg is: " + ratioOfSoySauce);
        System.out.println("The ratio of vinegar for 1.5 kg is: " + ratioOfVinegar);
    }
}
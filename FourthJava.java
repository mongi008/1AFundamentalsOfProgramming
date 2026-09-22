import java.io.*;

public class FourthJava {
    public static void main(String[] args) {
        String filepath = "Orpilla.txt";

        //wrap a filewriter inside a buffered writer

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filepath))) {

            writer.write("this is the first line of the text");

            writer.newLine();
            writer.write("this is the second line of text");
            writer.write("BufferedWriter make writing fast and efficient");
            System.out.println("Data successfully written to the file!");

        } catch (IOException e) {
            System.err.println("and error occured while writing to the file.");
            e.printStackTrace();
        }
    }
}
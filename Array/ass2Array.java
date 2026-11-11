import java.util.Arrays;


public class ass2Array {  //name lang uli ng class na trip ko
    public static void main(String[] args) {    //  dito nagsisimula tumakbo ang program





                String[][] seats = {                                   // Declare at initialize ng 2D String array na pinangalanang seats
                        {"Alice", "Bob", "Charlie"},                       // Row 1 index 0 tatlong upuan
                        {"David", "Emma", "Frank"}                         // Row 2 index 1 tatlong upuan
                };                                                     // Dulo ng array initialization

                System.out.println(seats[1][2]);                       // Iprint ang row index 1 (Row 2), column index 2 (Column 3) = Frank

                seats[0][1] = "Vacant";                                // Palitan ang "Bob" (row index 0, column index 1) ng "Vacant"

                System.out.println(Arrays.deepToString(seats));        // Iprint ang buong 2D array sa isang linya
            }                                                          // Dulo ng main method
        }                                                              // Dulo ng class


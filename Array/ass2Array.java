import java.util.Arrays; //// iimport ang Arrays class para magamit ang Arrays.deepToString()


public class ass2Array {  //name lang uli ng class na trip ko
    public static void main(String[] args) {    //  dito nagsisimula tumakbo ang program





                String[][] seats = {                                   // declare at initialize ng 2D String array na pinangalanang seats
                        {"Alice", "Bob", "Charlie"},                       // row 1 index 0 tatlong upuan
                        {"David", "Emma", "Frank"}                         // row 2 index 1 tatlong upuan
                };                                                     // dulo ng array initialization

                System.out.println(seats[1][2]);                       // iprint ang row index 1 (Row 2), column index 2 (Column 3) = Frank

                seats[0][1] = "Vacant";                                // palitan ang "Bob" (row index 0, column index 1) ng "Vacant"

                System.out.println(Arrays.deepToString(seats));        // iprint ang buong 2D array sa isang linya
            }                                                          // dulo ng main method
        }                                                              // dulo ng class


public class assArray {             //ito ung class namee na assArray(trip ko lang hewhe)
    public static void main(String[] args) {





                double[] tabemainit = new double[5];             // Gumawa ng double array na may 5 slots (index 0 hanggang 4)

                tabemainit[0] = 32.5;                            // Day 1: ilagay ang 32.5 sa index 0
                tabemainit[1] = 34.0;                            // Day 2: ilagay ang 34.0 sa index 1
                tabemainit[2] = 31.8;                            // Day 3: ilagay ang 31.8 sa index 2
                tabemainit[3] = 33.2;                            // Day 4: ilagay ang 33.2 sa index 3
                tabemainit[4] = 35.1;                            // Day 5: ilagay ang 35.1 sa index 4

                for (int i = 0; i < tabemainit.length; i++) {    // Loop i ay nagsisimula sa 0, tuloy hanggang i < 5, dagdag 1 kada ikot
                    System.out.println("Day " + (i + 1) + ": " + tabemainit[i]);                  //  iprint ang day number at ang temperature sa index i
                }                                                                        // Dulo ng loop

                tabemainit[2] = 32.0;                            // iupdate ang index 2 (Day 3) mula 31.8 papuntang 32.0

                System.out.println("Updated temperature for Day 3: " + tabemainit[2]); // I-print ang bagong value ng index 2
            }                                                      // Dulo ng main method
        }                                                          // Dulo ng class



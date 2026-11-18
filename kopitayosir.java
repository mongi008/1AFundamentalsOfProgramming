

public class kopitayosir { //Ito ung classs natin mehn
    public static void main(String[] args) { //Dito nag  sisimula lahat sa program





                // Dito natin nilagay yung sales sa loob ng isang array para hindi na paisa isang variable.
                int[] weeklySales = {120, 145, 130, 155, 180, 210, 195};

                // Ito naman yung mga araw para malaman natin kung anong araw yung katapat ng bawat sales.
                String[] daysOfWeek = {
                        "Monday", "Tuesday", "Wednesday",
                        "Thursday", "Friday", "Saturday", "Sunday"
                };

                // Ipapakita natin dito yung sales kada araw gamit ang for loop.
                System.out.println("--- Daily Sales ---");

                for (int i = 0; i < weeklySales.length; i++) {

                    // Ginamit yung i para sabay makuha yung araw at sales na magkapareho ng index.
                    System.out.println(daysOfWeek[i] + " sales: " + weeklySales[i]);
                }

                // Dito magsisimula sa 0 yung total kasi dito natin iaadd lahat ng sales.
                int totalSales = 0;

                // Iikot yung loop sa lahat ng sales at isa isang iaadd sa totalSales.
                for (int dailySale : weeklySales) {
                    totalSales += dailySale;
                }

                // Kukunin yung average sa pamamagitan ng pag-divide ng total sa bilang ng araw.
                // Ginawang double para makuha rin yung decimal na sagot.
                double averageSales = (double) totalSales / weeklySales.length;

                System.out.println("\n--- Weekly Summary ---");
                System.out.println("Total Sales: " + totalSales + " cups");
                System.out.println("Average Daily Sales: " + averageSales + " cups");

                // Inassume muna natin na yung unang value ang pinakamataas at pinakamababa.
                int maxSales = weeklySales[0];
                int minSales = weeklySales[0];

                // Ito yung gagamitin para malaman din kung anong araw nangyari yung highest at lowest sales.
                String bestDay = daysOfWeek[0];
                String worstDay = daysOfWeek[0];

                // Nagsimula sa 1 kasi nagamit na natin yung unang value bilang starting point.
                for (int i = 1; i < weeklySales.length; i++) {

                    // Kapag mas mataas yung current sales, papalitan natin yung maxSales.
                    if (weeklySales[i] > maxSales) {
                        maxSales = weeklySales[i];
                        bestDay = daysOfWeek[i];
                    }

                    // Kapag mas mababa naman, papalitan natin yung minSales.
                    if (weeklySales[i] < minSales) {
                        minSales = weeklySales[i];
                        worstDay = daysOfWeek[i];
                    }
                }

                // Ipapakita dito kung anong araw yung may pinakamataas at pinakamababang sales.
                System.out.println("\n--- Bests and Worsts ---");
                System.out.println("Best day was " + bestDay + " with " + maxSales + " cups.");
                System.out.println("Slowest day was " + worstDay + " with " + minSales + " cups.");
            }
        }


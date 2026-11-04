public class looping2Buff {
    public static void main(String[] args){

        int i;
        for(i = 2; i <= 100; i += 2){
            System.out.print(i  + " ");


            if  ( i % 20 == 0){
                System.out.println();
            }
        }
    }


}

package Loop;

/**
 * Created by zzyy3_000 on 4/24/2016.
 */
public class Stars {
    public static void main(String[] args){
        for(int i = 0; i < 5; i++) {       // input rows
            for (int j = 0; j < 6; j++){   // input columns
                System.out.print("*");     // non wrap
            }
            System.out.println();          // wrap
        }


        String[] wujiaoxing={"     *","    * *","* *    * *"," *      *","  *    *","    * *","     *"};
        for(int i=0;i<wujiaoxing.length;i++){
            System.out.println(wujiaoxing[i]);
        }
    }
}

package Number;

/**
 * Created by zzyy3_000 on 4/24/2016.
 */
public class BaseNumber {
    public static void main(String[] args){
        boolean flag = true;
        char ch = '*';
        int i;
   //     char ch = 'a';
   //     int i = 12;
        byte b = 12;
        short s = 24;
        long l = 890L;
        float f = 2.34F;
        double d = 2.5;

        System.out.println("flag = " + flag);
        //System.out.println("char = " + ch);
        System.out.println("byte = " + b);
        System.out.println("short = " + s);
    //    System.out.println("ing = " + i);
        System.out.println("long = " + l);
        System.out.println("float = " + f);
        System.out.println("double = " + d);

        for(i = 1; i <= 10; i++){
            System.out.println("int i = " + i);
        }
    }
}

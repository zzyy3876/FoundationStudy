package String;

/**
 * Created by zzyy3_000 on 4/14/2016.
 * Learning how to use StringBuilder
 */

import java.lang.StringBuilder;

public class StringBuilderLearn {

    public static void main(String args[]){
        String ab = "Zhengyu";
        String cd = ab;
        ab = "Zhao";
        System.out.println(cd + " " + ab);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello ").append(ab+ ",").append(cd);
        System.out.println("StringBuilder : " + builder);
    }
}

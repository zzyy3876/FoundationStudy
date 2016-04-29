package String;

/**
 Created by Zhengyu Zhao on 3/10/2016
 Return the first non-repeat Character in a string
 */

import java.lang.String;
import java.util.Scanner;
import java.util.HashMap;

public class Nonrepeatchr
{
    public static char NonRepeated(String str)
    {
        int i;
        int strLength = str.length();
        char c;

        /*
        *  Create a new HashMap
        *  */
        HashMap<Character, Integer> hm = new HashMap<Character, Integer>();


        /*
         * To scan string, and store character into HashMap
         * */
        for (i = 0; i < strLength; i++)
        {
            c = str.charAt(i);
            Integer it = hm.get(c);
            if (hm.containsKey(c))
            {
                hm.put(c, it + 1);
            }
            else if (it == null)
            {
                hm.put(c, 1);
            }
        }

        /*
        * Getting the count of each character from HashMap, and putting a index on screen
        * */
        for (i = 0; i < strLength; i++)
        {
            c = str.charAt(i);
            Integer it = hm.get(c);
            if (it == 1)
            {
                System.out.println("The first non-repeated character is:" +i);
                return c;
            }
        }

        /*
        * Put a character as non-repeated character is not found
        * */
        if (i >= strLength)
        {
            i = -1;
            System.out.println(i + ":there is no any non-repeated character!");
        }
        return ' ';
    }

    public static void main(String[] args)
    {
        System.out.println(" Please enter the input string :");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        NonRepeated(s);
    }
}

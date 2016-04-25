package Loop;

/**
 * Created by zzyy3_000 on 4/24/2016.
 */
public class Starsloop {
    public static void main(String[] args)
    {
        for(int i = 1; i < 10; i = i + 2) // Increase progressively rows: 表达式是 i = 1 代表第一行有1个星星；判定条件 i < 10 代表最后一行里不能多余10个星星；递增语句 i = i+2 代表每增加一行就加2个星星一直加到9个。
        {
            String a = "";
            for(int j = 1; j <= i; j++)
            {
                a = a +"  *";
            }
            System.out.println(a);
        }
        for(int x = 7; x > 0; x = x - 2) // Decrease progressively rows:
        {
            String b = "";
            for(int y = 1; y <= x; y++)
            {
                b = b + "  *";
                //b = b + "  *";
            }
            System.out.println(b);
        }
    }
}

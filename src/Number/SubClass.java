package Number;

/**
 * Created by zzyy3_000 on 4/24/2016.
 */
public class SubClass {
    public static void main(String[] args)
    {
        int s = 0;
        for(int i = 0; i <= 100; i++)
        {
            s += i;  // s的任务就是把i累加起来得出一个最后的结果
            System.out.println(i);  // 只是运行所有的i的数据
            //System.out.println(s); // 如果把s的运行结果放在这里，就是显示累加的过程
        }
        System.out.println(s); // 显示s的运行结果，这里显示的是总的累加结果，不显示过程
    }
}

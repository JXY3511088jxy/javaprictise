package prictise100;

import java.util.Scanner;

/**
 * 编写Application,求从命令行传入任意多个整数的最大值、最小值、平均值。
 */
public class class17 {
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        int[] x = new int[10];    //输入整数的个数在这里进行调整
        System.out.println("请输入10个整数：");    //根据输入的整数进行调整
        for (int i=0;i<x.length;i++){
            x[i] = s.nextInt();
        }

        System.out.println("max="+ArrayMax(x));
        System.out.println("min="+ArrayMin(x));
        System.out.println("ave="+ArrayAve(x));


    }
    static int ArrayMax( int array[] )
    {
        int max = array[0];
        for( int i =1; i < array.length; i++)
        {
            if ( array[i] > max )
            {
                max = array[i];
            }
        }
        return max;
    }
    static int  ArrayMin( int  array[] )
    {
        int min = array[0];
        for( int i =1; i < array.length; i++)
            if ( array[i] < min ) min = array[i];
        return min;
    }
    static int  ArrayAve( int  array[] )
    {
        int sum=0;
        for( int i =0; i < array.length; i++)
            sum+=array[i];
        return sum/array.length;
    }

}

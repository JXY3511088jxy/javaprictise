package prictise100;

import java.util.Scanner;

/**
 * 编写Application，主类中包含以下两个自定义方法： void  printA( int[ ]  array )和int[]  myArray(int  n)。
 * 方法printA(int[ ]  array)的功能是把参数数组各元素在屏幕的一行中输出。
 * 方法myArray(int  n)的功能是生成元素值是50~100之间的随机值的int型数组，数组元素的个数由参数n指定。
 * 在应用程序的main（ ）方法中，用命令行传入的整数作为myArray(int  n) 方法调用时的实际参数，生成一个整型数组，
 * 并调用方法printA（ ）输出该数组的所有元素。
 */
public class class4 {
//    static int n;
    public static void main (String[] args)
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        n = s.nextInt();
        int[] m;
        if (n>0){
        m = myArray(n);
        printA(m);}else {
            System.out.println("请输入大于零的整数！");
        }

/*        if(args.length > 0)
        {
            n=Integer.parseInt(args[0]);
            int[ ] a=new int[n];
            a=myArray(n);
            printA(a);
        }
        else  	{   System.out.println("缺命令行参数!");   System.exit(-1);   }*/
    }
    static void printA(int[] x)
    {
        for(int i=0; i< x.length; i++)
            System.out.print(x[i]+"   ");
        System.out.println( );
        return;
    }
    static int[]  myArray(int k)
    {
        int x[]=new int[k];
        for(int i=0; i< k; i++)
            x[i]=50+(int)(Math.random( )*50);
        return  x;
    }

}

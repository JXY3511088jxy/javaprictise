package prictise100;

import java.util.Scanner;

/**
 * 请编写一个Application，其主类名为Class1，其中包含三个同名方法mySqrt()，它们都只有一个参数，
 * 参数的类型分别为int型、float型和double型，它们的功能均为返回参数的平方根，返回值的类型与参数的类型相同。
 * 在主方法main( ) 中调用上面的三个方法，这三个方法的参数均来自命令行参数，最后将计算结果输出在屏幕上。
 */
public class class5 {
    static int mySqrt(int a){
        return (int)Math.sqrt(a);
    }
    static float mySqrt(float a){
        return (float) Math.sqrt(a);
    }
    static double mySqrt(double a){
        return (double) Math.sqrt(a);
    }

    public static void main(String[] args) {
        int x;
        float y;
        double z;
        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个整数：");
        x = s.nextInt();
        System.out.println("输入整数的平方根为:"+mySqrt(x));
        System.out.print("请输入一个单精度浮点数：");
        y = s.nextFloat();
        System.out.println("输入单精度浮点数的平方根为:"+mySqrt(y));
        System.out.print("请输入一个双精度浮点数：");
        z = s.nextDouble();
        System.out.println("输入双精度浮点数的平方根为:"+mySqrt(z));

    }
}

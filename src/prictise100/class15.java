package prictise100;

import java.util.Scanner;

/**
 * 从命令行传入3个整数，求3个整数的和、积、最大值、最小值。
 */
public class class15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        System.out.print("请输入第一个整数：");
        a = s.nextInt();
        System.out.print("请输入第二个整数：");
        b = s.nextInt();
        System.out.print("请输入第三个整数：");
        c = s.nextInt();
        System.out.println("3个整数的和为："+(a+b+c));
        System.out.println("3个整数的积为："+(a*b*c));
        //求最大值
        if (a>=b){
            if (a>=c){
                System.out.println("3个整数的最大值为："+a);
            }
        }else if (b>=c){
            System.out.println("3个整数的最大值为"+b);
        }else {
            System.out.println("3个整数的最大值为："+c);
        }
        System.out.println("最大值："+Math.max(c,Math.max(a,b)));
        //求最小值
        if (a<=b){
            if (a<=c){
                System.out.println("3个整数的最小值为："+a);
            }
        }else if (b>=c){
            System.out.println("3个整数的最小值为："+c);
        }else {
            System.out.println("3个整数的最小值为："+b);
        }
        System.out.println("最小值："+Math.min(c,Math.min(a,b)));

    }
}

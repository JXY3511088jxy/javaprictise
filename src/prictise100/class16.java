package prictise100;

import java.util.Scanner;

/**
 * 请编写一个Application实现如下功能：通过命令行中给出的float型参数x, 和int型参数y（如果参数少于两个，
 * 给出提示后退出系统），调用Math类中的方法求x的y次方并输出。
 */
public class class16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Float x;
        Integer y;
        System.out.print("请输入x：");
        x = s.nextFloat();
        System.out.print("请输入y：");
        y = s.nextInt();

//        Float f = new Float(x);
//        Integer i = new Integer(y);

        if (x == null || y == null ){
            System.out.println("输入参数错误！");
        }else {
            System.out.println(Math.pow(x,y));
        }


    }
}

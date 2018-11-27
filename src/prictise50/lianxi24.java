package prictise50;

import java.util.Scanner;

/**
 * 给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class lianxi24 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=0;
        System.out.print("请输入一个正整数：");
        x=s.nextInt();
        if(x<=0 || x>99999){
            System.out.println("输入的数字不正确！");
        } else if (x/10000>=1){
            System.out.println("输入的是一个五位数！");
            System.out.println("万位数字为："+x/10000);
            System.out.println("千位数字为："+x%10000/1000);
            System.out.println("百位数字为："+x%1000/100);
            System.out.println("十位数字为："+x%100/10);
            System.out.println("个位数字为："+x%10);
        }else if (x/1000>=1){
            System.out.println("输入的是一个四位数！");
            System.out.println("千位数字为："+x/1000);
            System.out.println("百位数字为："+x%1000/100);
            System.out.println("十位数字为："+x%100/10);
            System.out.println("个位数字为："+x%10);
        }else if (x/100>=1){
            System.out.println("输入的是一个三位数！");
            System.out.println("百位数字为："+x/100);
            System.out.println("十位数字为："+x%100/10);
            System.out.println("个位数字为："+x%10);
        }else if (x/10>=1){
            System.out.println("输入的是一个两位数！");
            System.out.println("十位数字为："+x/10);
            System.out.println("个位数字为："+x%10);
        }else {
            System.out.println("输入的是一个一位数！");
            System.out.println("输入的数字为："+x);
        }
    }
}

package prictise50;

import java.util.Scanner;

/**
 * 一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class lianxi25 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        System.out.print("请输入一个五位数：");
        n = s.nextInt();
        if (n/10000<1 || n/10000>10 || n<=0){
            System.out.println("输入的数字错误！");
        }else if (n/10000==n%10 && n%10000/1000==n%100/10){
            System.out.println("输入的是一个回文数！它的值为："+n);
        }else {
            System.out.println("输入的不是一个回文数！");
        }
    }
}

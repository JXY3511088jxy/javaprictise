package prictise100;

import java.util.Scanner;

/**
 * 请编写一个实现如下功能的Application：比较命令行中给出的两个整数是否相等，
 * 并根据比较结果显示"相等"或"不相等"。
 */
public class class13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.print("请输入整数a：");
        a = s.nextInt();
        System.out.print("请输入整数b：");
        b = s.nextInt();
        if (a==b){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }

    }
}

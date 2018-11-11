package prictise100;

import java.util.Scanner;

/**
 * 编写一个Application程序，比较命令行中给出的两个字符串是否相等，并输出比较的结果。
 */
public class class14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a,b;
        System.out.print("请输入字符串a：");
        a = s.nextLine();
        System.out.print("请输入字符串b：");
        b = s.nextLine();
        if (a.equals(b)){
            System.out.println("相等");
        }else {
            System.out.println("不相等");
        }
    }
}

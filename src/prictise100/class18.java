package prictise100;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 请编写一个实现如下功能的Application：从命令行依次取三个参数 x, y, op 做算术运算，其中 x, y为 int 型数据，
 * op 为运算符（＋、－、×、÷ 之一）,请显示 x  op  y 的结果。
 */
public class class18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x=0,y=0;
        char op;
        System.out.println("请输入x的值：");
        try {
            x = s.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("请重新输入一个整数");
        }
        System.out.println("请输入y的值：");
        try {
            y = s.nextInt();
        }catch (InputMismatchException e){
            e.printStackTrace();
            System.out.println("请重新输入一个整数");
        }
        System.out.println("请输入op的值：");
        op = s.next().charAt(0);
//        if (op!='+'||op!='-'||op!='*'||op!='/'){
//            System.out.println("输入的运算符错误！！！请重新运行程序");
//        }
        switch (op) {
            case '+':
                System.out.println("x+y的值为："+(x+y));
                break;
            case '-':
                System.out.println("x-y的值为："+(x-y));
                break;
            case '*':
                System.out.println("x*y的值为："+x*y);
                break;
            case '/':
                System.out.println("x/y的值为："+x/y);
                break;
            default:
                System.out.println("输入的运算符错误！请重新运行程序");
        }

    }
}

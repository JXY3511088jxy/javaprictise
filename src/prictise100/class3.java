package prictise100;

import java.util.Scanner;

/**
 * 请编写一个Application实现如下功能：接受命令行中给出的三个参数x1、x2和op，其中x1和x2为float型数，
 * op是某个算数运算符（+、 —、*、/ 之一），
 * 请以如下形式输出 x1 和x2执行 op 运算后的结果（假设x1的值为269，x2的值为18，op为运算符—）：
 *                      269 – 18=251
 */
public class class3 {
    public static void main(String[] args) {
        float x,y;
        char op;
        input ins = new input();
        System.out.print("x1的值为：");
        x = ins.input();
        System.out.print("x2的值为：");
        y = ins.input();
        System.out.print("算数运算符为：");
        Scanner s = new Scanner(System.in);
        op = s.next().charAt(0);
        switch(op)
        {
            case '+': System.out.println(x+"+"+y+"="+(x+y));  break;
            case '-': System.out.println(x+"-"+y+"="+(x-y));  break;
            case '*': System.out.println(x+"*"+y+"="+(x*y));  break;
            case '/': System.out.println(x+"/"+y+"="+(x/y));  break;
            case '%': System.out.println(x+"%"+y+"="+(x%y));  break;
            default : System.out.println("非法运算符!");
        }




    }
}
class input{
    public float input() {
        float a = 0;
        Scanner s = new Scanner(System.in);
        a = s.nextFloat();
        return a;
    }
}
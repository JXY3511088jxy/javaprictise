package prictise50;

import java.util.Scanner;

/**
 * 输入三个整数x,y,z，请把这三个数由小到大输出
 */
public class lianxi15 {
    public static void main(String[] args) {
        input1 fnc = new input1();
        int x=0, y=0, z=0;
        System.out.print("输入第一个数字：");
        x = fnc.input();
        System.out.print("输入第二个数字：");
        y = fnc.input();
        System.out.print("输入第三个数字：");
        z = fnc.input();
        if(x > y) {
            int t = x;
            x = y;
            y = t;
        }
        if(x > z) {
            int t = x;
            x = z;
            z = t;
        }
        if(y > z) {
            int t = y;
            y = z;
            z = t;
        }
        System.out.println( "三个数字由小到大排列为： "+x + " " + y + " " + z);
    }

}
class input1{
    public int input(){
        int a = 0;
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();
        return a;
    }
}

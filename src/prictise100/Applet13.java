package prictise100;

import java.applet.Applet;
import java.awt.*;

/**
 * 定义接口A，接口内有两个方法： method1(int x)和method2(int x,int y)，它们的返回值类型均为int。请编写一个Applet，
 * 并使其实现接口A：令方法method1(int x)的功能是求5的x次方、方法method2(int x,int y) 的功能是求两参数的最大值。
 * 在paint（）方法中调用这两个方法，显示method1(2)和 method2(2,8)的结果。
 */
public class Applet13 extends Applet implements A7{
    public int method1(int x){
        int result = 1;
        for (int i=1;i<=x;i++){
            result*=5;
        }
        return result;
    }
    public int method2(int x,int y){
        return x>y?x:y;
    }
    public void paint(Graphics g){
        g.drawString("调用method1(2)的结果： "+method1(2),20,20);
        g.drawString("调用method2(2,8)的结果： "+method2(2,8),20,40);
    }
}

interface A7{
    public int method1(int x);
    public int method2(int x,int y);
}

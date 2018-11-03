package prictise100;

import java.applet.Applet;
import java.awt.*;

/**
 * 请编写一个Applet，其主类名为Applet1，其中包含两个同名方法arrayMin( ),它们都只有一个参数，
 * 其中一个arrayMin( )方法的参数为int型数组，返回值类型为int型数；另一个arrayMin( )方法的参数为double型数组，
 * 返回值类型为double型数；这两个方法的功能均为返回参数数组元素的最小值。
 * 通过paint( )方法调用上述两个同名方法arrayMin( )，
 * 求数组a (其元素的值依次为26，82，-3，65，18，9)和数组b (其元素的值依次为3.6，57.2，8.5，78.8) 的最小元素的值并输出。
 */
public class Applet6 extends Applet {
    int[] a={26,82,-3,65,18,9};
    double[] b={3.6,57.2,8.5,78.8};
    public void paint(Graphics g)
    {
        g.drawString("数组a 的最小元素的值为: "+ arrayMin(a),20,20);
        g.drawString("数组b 的最小元素的值为: "+ arrayMin(b),20,40);
    }
    int arrayMin(int[] x)
    {
        int y=x[0];
        for(int i=1; i< x.length; i++) {
            if (y > x[i]) y = x[i];
        }
        return  y;
    }
    double arrayMin(double[] x)
    {
        double y=x[0];
        for(int i=1; i< x.length; i++){
            if(y>x[i])   y=x[i];
        }
        return  y;
    }

}

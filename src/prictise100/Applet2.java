package prictise100;

import java.applet.Applet;
import java.awt.*;

/**
 * 请编写一个Applet，其功能为：取一个小于10000的正随机整数，并输出该数的平方根。
 * 要求这些功能在主类的方法paint( ) 中实现，并使输出结果在四捨五入后保留小数点后4位。
 */
public class Applet2 extends Applet {
    public void paint(Graphics g){
        int k;
        k = (int)(Math.random()*1000);
        g.drawString(""+k+" 的平方根约等于 "+
                (int)((Math.sqrt(k)+0.00005)*10000)/10000.0,20,20);

    }
}

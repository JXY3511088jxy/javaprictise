package prictise100;

import java.applet.Applet;
import java.awt.*;

/**
 * 编写Applet，其功能为：取两个小于1000的正随机数，若两个数均小于10，先将它们都放大50倍，否则不改变这两个数。
 * 最后，求这两个数的和并将结果输出。要求这些功能在主类的方法init( ) 中实现，
 * 并使输出结果仅保留小数点后4位（不需四捨五入）。
 */
public class Applet1 extends Applet {
    public void init( )
    {
        Label out1=new Label("                               ");
        Label out2=new Label("                               ");
        double x,y;

        add(out1);
        add(out2);
        x=Math.random( )*1000;
        y=Math.random( )*1000;
        if(x<10&y<10) {  x*=50;    y*=50;    }
        out1.setText(""+x+"+"+y+" 约等于 ");
        out2.setText(""+(int)((x+y)*10000)/10000.0);
    }

}

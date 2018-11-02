package prictise100;

import java.applet.Applet;
import java.awt.*;

/**
 * 请编写一个Applet,其中定义了两个double类型数组a和b，还定义了一个方法square( )。
 * 数组a各元素的初值依次为1.2、2.3、3.4、4.5、5.6，
 * 数组b各元素的初值依次为9.8、8.7、7.6、6.5、5.4、4.3；
 * 方法square( )的参数为double类型的数组，返回值为float类型的数组,功能是将参数各元素的平方做为返回数组的元素的值。
 * 请在方法paint（）中分别以a和b为实在参数调用方法square( )，并将返回值输出在屏幕上。
 * 要求调用square( a )的返回数组输出在Applet的一行上，数组的第一个元素的输出坐标为（20，20），
 * 其后的每个元素间隔40个像素。调用square( b )的返回数组输出在Applet的一列上，
 * 即下标为i+1(i=0,1,2,3,......)的元素的值,在下标为i的元素的值的正下方，
 * 其返回数组的第一个元素的输出坐标为（20，40），行隔为20像素。
 */
public class Applet5 extends Applet {
    double a[ ]={1.2,2.3,3.4,4.5,5.6};
    double[ ] b={9.8,8.7,7.6,6.5,5.4,4.3};

    public void paint(Graphics g)
    {
        float[ ] x=new float[a.length];
        float[ ] y=new float[b.length];
        x=square(a);
        y=square(b);
        for(int i=0; i<x.length;i++)
            g.drawString(""+x[i],20+i*40,20);
        for(int i=0; i<y.length;i++)
            g.drawString(""+y[i],20,40+i*20);
    }
    float[ ] square(double x[ ])
    {
        float[ ] y=new float[x.length];
        for(int i=0; i< x.length; i++)
            y[i]=(float)(x[i]*x[i]);
        return  y;
    }

}

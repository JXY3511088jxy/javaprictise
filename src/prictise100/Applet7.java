package prictise100;

import java.applet.Applet;
import java.awt.*;
import java.awt.im.InputContext;

/**
 * 请编写一个Applet，其主类名为Applet1，其中包含三个同名方法addM(int  x, byte  y)、addM(float  x,double  y)、
 * addM(double  x,double  y)，它们的功能均为求两个参数之和，返回值类型与第一个参数的类型相同。
 * 在主类Applet1中，通过paint( )方法调用上面的三个方法，实现12345+67、89.6f+6.9e-8、0.987654321+32.1，
 * 然后将计算结果输出，输出位置分别为坐标（20，40）、（20，60）、（20，80）。
 */
public class Applet7 extends Applet {
    int addM(int x,int y){
        return x+y;
    }
    float addM(float x,double y){
        return (float)(x+y);
    }
    double addM(double x,double y){
        return x+y;
    }

    public void paint(Graphics g){
        g.drawString("12345+67 = "+ addM(12345,67),20,40);
        g.drawString("89.6+6.9e-8 = "+ addM(89.6f,6.9e-8),20,60);
        g.drawString("0.987654321+32.1 = "+ addM(0.987654321,32.1),20,80);
    }

    }

package prictise100;

import java.applet.Applet;
import java.awt.*;

/**
 * 请编写一个Applet，它由两个类定义组成：类A中定义了short型变量i和char型变量ch，
 * 及一个带两个参数的构造函数（为变量i和ch做初始化）。
 * 主类Applet1中创建了两个A类的对象x1（i的初始值为12，ch的初始值为'6'）和x2（i的初始值为62，ch的初始值为65），
 * 还定义了一个方法b，b的参数和返回值均为A类的对象，功能为将参数对象的属性i加3，属性ch也加3，
 * 使返回结果为另一个A类的对象（即不破坏实在参数的值）。请在paint()方法中先输出x1、x2的属性值，
 * 然后再分别以x1、x2为实在参数调用方法b( )，并输出调用结果，最后再次输出x1、x2的属性值。
 */
public class Applet9 extends Applet {
    A2  x1,x2;
    public void init( )
    {	x1=new A2((short)12,'6');		x2=new A2((short)62,(char)65);	}
    public void paint(Graphics g)
    {
        A2  a1=new A2((short)0,' ');
        A2  a2=new A2((short)0,' ');
        g.drawString("对象x1的属性值:  i=" + x1.i+"  ch="+ x1.ch,20,20);
        g.drawString("对象x1的属性值:  i=" + x2.i+"  ch="+ x2.ch,20,40);
        a1=b(x1);		a2=b(x2);
        g.drawString("以x1为实参调用方法b( ) 生成的新的A类对象的属性值:  i="
                +a1.i+"  ch="+a1.ch,20,60);
        g.drawString("以x2为实参调用方法b( ) 生成的新的A类对象的属性值:  i="
                +a2.i+"  ch="+a2.ch,20,80);
        g.drawString("调用后，对象x1的属性值:  i=" + x1.i+"  ch="+ x1.ch,20,100);
        g.drawString("调用后，对象x1的属性值:  i=" + x2.i+"  ch="+ x2.ch,20,120);
    }
    A2  b(A2  y)
    {
        A2  a=new A2((short)0,' ');
        a.i=(short)(y.i+3);
        a.ch=(char)(y.ch+3);
        return  a;
    }


}
class A2{
    short i;
    char ch;
    A2(short i,char ch){
        this.i = i;
        this.ch = ch;

    }
}

package prictise100;

import java.applet.Applet;
import java.awt.*;

/**
 *请编写Applet，它由三个类定义组成: 类A中只定义了一个类型为String的对象x和带有一个参数的构造函数（用来初始化x）；
 * 类B是类A的子类，其中定义了一个int类型的变量x和一个带两个参数的构造函数（用来为父类中的对象x和类B中的变量x做初始化），
 * 还定义了一个方法myPrint( )，功能为输出父类A中的x和其子类B 中的x的值；主类Applet1中定义了B类的对象b，
 * 请通过创建b为上述两个x赋值(类A中的x的值为“这是父类的x.”, 类B中的x的值为68)，
 * 通过paint()方法在坐标（20，30）处显示两个x的值。
 */
public class Applet11 extends Applet {
    B5 b5 = new B5("这是父类的x",68);
    public void paint(Graphics g){
        b5.myPrint(g);
    }
}

class A5{
    String x;
    A5(String x){
        this.x = x;
    }
}

class B5 extends A5{
    int x;
    B5(String x,int y){
        super(x);
        this.x = y;
    }
    void myPrint(Graphics g){
        g.drawString("类A5中的x为："+super.x+"类B5中的x为："+x,20,30);
    }
}

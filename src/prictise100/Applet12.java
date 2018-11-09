package prictise100;
/**
 * 请编写Applet，它由三个类定义组成, 类名分别为A、B和Applet1：类A中定义了类型为int的变量i、
 * 类型为float的变量f和类型为char的变量ch；类A还定义了三个构造函数，其中,第一个构造函数带有一个int类型的参数
 * （用于初始化i），第二个构造函数带有两个参数（参数类型分别为int和float,用于初始化i和f）,
 * 第三个构造函数带有三个参数（参数类型分别为int、float和char,用于初始化i、f和ch）。类B是类A的子类，
 * 其中仅定义了一个类型为boolean的变量b和一个带四个参数的构造函数
 * （用来为父类中的变量i、f、ch和本类的变量b做初始化）。主类Applet1中定义了一个初值为32.6的double型变量d
 * 和一个B类的对象b，请通过创建b为上述i、f、ch和b赋值(i的值为50,f的值为7.2,ch的值为’h’,b的值为true)，
 * 用paint()方法在（10，30）位置处显示i,f,ch,b,d的值。
 */

import java.applet.Applet;
import java.awt.*;

public class Applet12 extends Applet {
    double d = 32.6;
    B6 b6 = new B6(50,7.2f,'h',true);
    public void paint(Graphics g){
        g.drawString("i="+b6.i+"f="+b6.f+"ch="+b6.ch+"b="+b6.b
        +"d="+d,30,70);
    }
}
class A6{
    int i;
    float f;
    char ch;
    A6(int i){
        this.i = i;
    }
    A6(int i,float f){
        this.i = i;
        this.f = f;
    }
    A6(int i,float f,char ch){
        this.i = i;
        this.f = f;
        this.ch = ch;
    }
}

class B6 extends A6{
    boolean b;
    B6(int i,float f,char ch,boolean b){
        super(i,f,ch);
        this.b = b;
    }
}
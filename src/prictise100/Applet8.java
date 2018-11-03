package prictise100;

import java.applet.Applet;
import java.awt.*;

/**
 * 请编写Applet，它由三个类定义组成，类名分别为A、B和Applet1：
 * 类A中定义了一个类型为float的属性f和一个类型为byte的私有属性k；类A还定义了一个带有一个参数的构造函数（用于初始化f），
 * 和两个公共方法setk( )和getk( ), 其中setk( ) 的功能为给私有属性k赋值,getk( )的功能为返回私有属性k的值。类B是类A的子类，
 * 其中仅定义了一个类型为boolean的属性b和一个带两个参数的构造函数（用来为父类中的变量f和本类的变量b做初始化）。
 * 主类Applet1中定义了一个初值为123的int型变量n和一个B类的对象x，请通过创建x为上述f和b赋值(f的值为68.963,b的值为true);
 * 在paint()方法中, 给A类的私有属性k赋值66，然后显示f，k，b，n的值。
 */
public class Applet8 extends Applet {
    int n = 123;
    B x = new B(68.693f,true);
    public void paint(Graphics g)
    {
        x.setk((byte) 66);
        g.drawString("f="+x.f+"  k="+x.getk( )+"  b="+x.b+"  n="+n,10,20);
    }


}
class A{
    float f;
    private byte k;
    A(float f){
        this.f = f;
    }
    public void setk(byte k) {
        this.k = k;
    }
    public byte getk(){
        return k;
    }
}
class B extends A{
    boolean b;
    B(float f,boolean b){
        super(f);
        this.b = b;
    }
}
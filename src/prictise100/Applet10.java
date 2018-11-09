package prictise100;

import java.applet.Applet;
import java.awt.*;

/**
 * 请按如下要求定义两个类A和B, 类A中定义一个char类型属性x（将其赋值为65）和一个在小程序窗口中输出x值的方法myPrint()。
 * 类B是类A的子类，其中定义一个int 类型属性y（将其赋值为16）和String类型的属性s（将其赋值为“java program!”）；
 * 类B中 也定义了一个名为myPrint的方法，其功能为在小程序窗口中输出y和s值；类B中还有一个方法printAll( )，
 * 该方法中分别调用父类和子类的myPrint()方法做输出。编写一个Applet，在主类Applet1中创建类B的对象b，
 * 调用printAll( )方法输出对象b 的属性值。
 */
public class Applet10 extends Applet {
    B3 b3 = new B3();
    public void paint(Graphics g){
        b3.printAll(g);
    }
}
class A3{
    char x = 65;
    void myPrint(Graphics g){
        g.drawString("x="+x,20,20);
    }
}

class B3 extends A3{
    int y = 16;
    String s = "java program";
    void myPrint(Graphics g){
        g.drawString("y="+y+"s="+s,20,20);
    }
    void printAll(Graphics g){
        super.myPrint(g);
        myPrint(g);
    }
}


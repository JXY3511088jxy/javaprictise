package prictise100;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * 请按如下要求定义两个类A和B, 类A中定义一个double 类型变量d（将其赋值为8.8）和一个方法int_d(double  dd )，
 * 该方法的功能是返回参数dd的整数部分。类B是类A的子类，
 * 其中定义一个float 类型变量f（将其赋值为18.3）和一个方法int_f(float  ff )，
 * 该方法的功能是返回参数ff的整数部分。编写一个Application，创建类B的对象b，
 * 在主方法main( ) 中先显示d和f的值，然后分别以d和f为实在参数调用int_d( )方法和int_f( )方法，
 * 并将它们的返回值显示在屏幕上。
 */
public class class6 {
    public static void main(String[] args) {
        B1 b1 = new B1();    //只需要实例化子类就够了，父类的成员和方法子类继承。
        System.out.println("d的值为："+b1.d);
        System.out.println("f的值为："+b1.f);
        System.out.println("以d为实在参数调用ind_d()方法："+b1.int_d(b1.d));
        System.out.println("以f为实在参数调用int_f()方法："+b1.int_f(b1.f));
    }
}
class A1{
    double d = 8.8;
    A1(){};
    public int int_d(double dd){
        return (int)dd;
    }
}
class B1 extends A1{
    float f = 18.3f;
    public int int_f(float ff){
        return (int)ff;
    }
}

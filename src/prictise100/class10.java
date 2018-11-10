package prictise100;

/**
 * 定义类A，在其中定义一个final变量myPI，其类型为float，值为3.1416；类A中还定义一个final方法 m1(float  r)，
 * 该方法返回值类型为float，功能是求半径为r的圆的周长（公式为：2πr）。再定义类A的子类B，B为final类，
 * 其中定义一个返回值类型为void的方法 m2(float  r)，功能是先调用父类的方法m1( )求半径为r的圆的周长并输出计算结果，
 * 然后输出同一个圆的面积（公式为：πr2）。请编写一个Application ，利用类B计算并输出半径为5的圆的周长和面积。
 */
public class class10 {
    public static void main(String[] args) {
        B8 b8 = new B8();
        b8.m2(5);
    }
}

class A8{
    final float myPI = 3.1416f;
    final float m1(float r){
        return 2*myPI*r;
    }
}

 final class B8 extends A8{
    void m2(float r){
        System.out.println("半径为"+r+"的圆的周长="+m1(r));
        System.out.println("圆的面积为："+myPI*r*r);
    }
}
//final修饰变量，表示是一个常量；修饰方法，该方法不会被继承的类重写；修饰类，该类不会被继承。
package prictise100;

/**
 * 请编写一个Application ，在其主类中定义一个int 类型变量i ，并令其初值为123 ；主类中还定义了 m1( )和m2( )等两个方法。
 * 在主方法main( ) 和方法m1( )中也各定义一个int 类型变量i ，它们的初值分别为456和789 ；
 * 方法m1( )的功能是输出它的局部变量i的值；方法m2( )的功能是先输出类变量i 的值 ，然后使类变量i 增加值 6后再次输出其值 ；
 * 主方法main( ) 的功能是先输出它的局部变量i的值，然后先后调用m1( )和m2( )实现它们的功能。
 */
public class class7 {

    static int i = 123;

    public static void main(String[] args) {
        int i=456;
        System.out.println(i);
        class7 c7 = new class7();
        c7.m1();    //给方法加上static就可以直接用m1()来进行调用了，不用先实例化类。
        c7.m2();
    }
    void m1(){
        int i=789;
        System.out.println(i);;
    }
    void m2(){
        System.out.println(i+6);
    }
}

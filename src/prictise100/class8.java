package prictise100;

/**
 * 请按如下要求定义两个类A和B, 类A中定义一个方法area(float  r), 其返回值类型为float型，
 * 该方法的功能是返回半径为r的圆的面积（圆的面积公式为：πr2，其中 r是圆的半径）。类B是类A的子类，
 * 其中也定义了一个名为area的方法area(float  r)，该方法的功能是返回半径为r的球的表面积（球的表面积的计算公式为：
 * 4πr2，其中r为球的半径），返回值类型也为float型；在类B中还定义了另一个方法myPrint(float  r)，
 * 功能是分别调用父类和子类的方法area( )计算半径相同的圆的面积和球的表面积并输出调用结果。
 * 编写一个Application，创建类B的对象b，在主方法main( )中调用myPrint(float  r),
 * 输出半径为1.2的圆的面积和半径为1.2的球的表面积。
 */
public class class8 {
    public static void main(String[] args) {
        B4 b4 = new B4();
        b4.myPrint(1.2f);
    }
}

class A4{
    float area(float r){
        return (float)Math.PI*r*r;
    }
}

class B4 extends A4{
    float area(float r){
        return 4*(float)Math.PI*r*r;
    }
    void myPrint(float r){
        System.out.println("圆的面积为："+super.area(r));
        System.out.println("球的面积为："+area(r));
    }
}

package prictise100;

import java.util.Scanner;

/**
 * 定义名为VolumeArea的抽象类，在其中定义圆周率π的值为3.14159，并定义两个抽象方法volume(double  r)和area(double  r)，
 * 它们的返回值类型均为float。再定义以类VolumeArea为父类的子类VolumeAndArea，在该子类中实现父类中的抽象方法：
 * 方法volume(double  r) 的功能是求半径为r的球的体积（公式为：4πr3/3）；
 * 方法area(double  r)的功能是求半径为r的圆的面积（公式为：πr2）。请编写一个Application ，
 * 在其主类中定义一个VolumeAndArea类的对象x，通过对象x求半径为r(r的值由命令行给定)的球的体积及该球最大切面的圆的面积，
 * 并输出计算结果。
 */
public class class9 {
    public static void main(String[] args) {
        VolumeAndArea x = new VolumeAndArea();
        Scanner s = new Scanner(System.in);
        double r;
        System.out.print("请输入一个r值：");
        r = s.nextDouble();
        System.out.println("球的体积为："+x.volume(r));
        System.out.println("该球最大切面的圆的面积为："+x.area(r));
    }
}

abstract class VolumeArea{
    float π = 3.14159f;
    abstract float volume(double r);
    abstract float area(double r);
}

class VolumeAndArea extends VolumeArea{

    float volume(double r) {
        return 4*(float)(π*r*r*r/3);
    }

    float area(double r){
        return (float)(π*r*r);
    }
}
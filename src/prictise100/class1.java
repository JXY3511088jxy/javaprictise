package prictise100;

/**
 * 请编写一个Application实现如下功能：在主类中定义两个double类型数组a和b，再定义一个方法sqrt_sum( )。
 * 数组a各元素的初值依次为1.2、2.3、3.4、4.5、5.6， 数组b各元素的初值依次为9.8、8.7、7.6、6.5、5.4、4.3；
 * 方法sqrt_sum ( )的参数为double类型的数组，返回值类型为float型,功能是求参数各元素的平方根之和。
 * 请在主方法main（）中分别以a和b为实在参数调用方法sqrt_sum ( )，并将返回值输出在屏幕上。
 */
public class class1 {
    static double[] a = {1.2,2.3,3.4,4.5,5.6};
    static double[] b ={9.8,8.7,7.6,6.5,5.4,4.3};
    public static void main(String[] args) {

        System.out.println("数组a各元素的平方根之和为:"+sqrt_sum(a));
        System.out.println("数组b各元素的平方根之和为:"+sqrt_sum(b));

    }
public static float sqrt_sum(double[] x){
        double y = 0.0;
        for (int i = 0;i<x.length;i++){
            y+=Math.sqrt(x[i]);
        }
        return (float)y;
}
}

package prictise100;

/**
 * 请编写一个Application实现如下功能：在主类中定义方法f1(int  n) 和方法f2(int  n)，它们的功能均为求 n!，
 * 方法f1( ) 用循环实现，方法f2( )用递归实现 。在主方法main( ) 中，
 * 以4为实在参数分别调用方法f1( ) 和方法f2( )，并输出调用结果。
 */
public class class2 {

    public static long f1(int n){
        long k=1;
        for (int i=1;i<=n;i++){
            k*=i;
        }
        return k;
    }
    public static long f2(int n){
        if (n==1){
            return 1;
        }else {
            return n*f2(n-1);
        }
    }

    public static void main(String[] args) {

        System.out.println("用循环实现求 n! 的结果(n=4):"+f1(4));
        System.out.println("用递归实现求 n! 的结果(n=4):"+f2(4));

    }
}

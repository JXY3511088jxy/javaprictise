package prictise50;

/**
 * 利用递归方法求5!。
 */
public class lianxi22 {
    public static void main(String[] args) {
        int n=5;
        rec f1 = new rec();
        System.out.println(n+"! = "+f1.re(n));

    }
}
class rec{
    public long re(int n){
        long value = 0;
        if (n==1){
            value = 1;
        }else {
            value = n*re(n-1);
        }
        return value;
    }
}

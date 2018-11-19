package prictise100.异常处理;

/**
 * 通过下面的程序了解异常的处理、以及异常发生时程序的执行情况。
 */
public class class1 {
    public static void main(String args[])
    {
        int a=5;
        int b=0;
        //System.out.println(a/b);
        try
        {
            System.out.println("a="+a);
            System.out.println(a/b);
            System.out.println("a*a="+a*a);
        }
        catch(ArithmeticException e)
        {	System.out.println("除数为0，这是不行的！");		}
        finally
        {	System.out.println("a*a*a="+a*a*a);       }
        System.out.println("异常已发生，但不影响程序的执行！");
    }

}

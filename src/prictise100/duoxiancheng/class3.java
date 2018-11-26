package prictise100.duoxiancheng;

/**
 * 请编写一个类，类名为MulThread ，类中定义了含一个字符串参数的构造函数，并实现了Runnable接口，
 * 接口中的run( )方法如下实现：方法中先在命令行显示该线程信息，然后随机休眠小于1秒的时间，
 * 最后后显示线程结束信息: "finished"+线程名。编写Application，
 * 在其中通过Runnable创建MulThread类的三个线程对象t1、t2、t3，并启动这三个线程。
 */
public class class3 {
    public static void main(String[] args) {
        MulThread m1 = new MulThread("First");
        MulThread m2 = new MulThread("Second");
        MulThread m3 = new MulThread("Third");

        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        Thread t3 = new Thread(m3);

        t1.start();
        t2.start();
        t3.start();
    }
}
class MulThread implements Runnable{
    String s;
    MulThread(String s){
        this.s = s;
    }
    public void run(){
        System.out.println("线程名称为："+s);
        try {
            Thread.sleep((int)(Math.random())*1000);
        }catch (InterruptedException e){}
        System.out.println("finished"+s);
    }
}

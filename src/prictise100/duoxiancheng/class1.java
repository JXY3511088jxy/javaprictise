package prictise100.duoxiancheng;

/**
 * 请编写一个类，类名为subThread ，它是Thread 类的子类。该类中定义了含一个字符串参数的构造函数和run( )方法，
 * 方法先在命令行显示线程的名称，然后随机休眠小于1秒的时间，最后显示线程结束信息: "finished"+线程名。
 * 编写Application，在其中创建subThread类的三个对象t1、t2、t3，它们的名称分别为"First"、" Second"、" Third"，
 * 并启动这三个线程。
 */
public class class1 {
    public static void main(String[] args) {
        subThread t1 = new subThread("First");
        subThread t2 = new subThread("Second");
        subThread t3 = new subThread("Third");
        t1.start();
        t2.start();
        t3.start();
    }
}

class subThread extends Thread{
    subThread(String s){
        super(s);
    }
    public void run(){
        System.out.println("线程的名称为："+getName());
        try {
            sleep((int)(Math.random())*1000);
        }catch (InterruptedException e){}
        System.out.println("finished"+getName());
    };
}

package prictise100.多线程;

/**
 * 请编写一个类，类名为subThread ，它是Thread 类的子类。该类中定义了含一个字符串参数的构造函数和run( )方法，
 * 方法中有一个for循环，循环一共进行5次，循环体中先在命令行显示该线程循环到了第几次，然后随机休眠小于1秒的时间，
 * 循环结束后显示线程结束信息: 线程名+"finished"。编写Application，在其中创建subThread类的三个对象t1、t2、t3，
 * 它们的名称分别为"First"、" Second"、" Third"，并启动这三个线程。
 */
public class class2 {
    public static void main(String[] args) {
        subThread1 t1 = new subThread1("First");
        subThread1 t2 = new subThread1("Second");
        subThread1 t3 = new subThread1("Thread");
        t1.start();
        t2.start();
        t3.start();
    }
}
class subThread1 extends Thread{
    subThread1(String s){
        super(s);
    }
    public void run(){
        for (int i=1;i<=5;i++){
            System.out.println(getName()+"循环到了第"+i+"次");
            try {
                sleep((int)(Math.random())*1000);
            }catch (InterruptedException e){}
        }
        System.out.println(getName()+"finished");
    }
}
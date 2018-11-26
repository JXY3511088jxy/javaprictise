package prictise100.duoxiancheng;

import java.applet.Applet;
import java.awt.*;
import java.util.Calendar;

/**
 * 编写小程序实现一个数字时钟
 */
public class Applet1 extends Applet implements Runnable
{
    Thread timeThread;
    Font wordFont;
    int year,month,day;
    int weekday;
    int hour,minute,second;
    public void init()
    {
        this.setBackground(Color.black);
        wordFont=new Font("楷体_gb2312",Font.BOLD,50);
    }
    public void start()
    {
        if(timeThread==null)
        {
            timeThread=new Thread(this);
            timeThread.start();
        }
    }
    public void stop()
    {
        if(timeThread!=null)
        {
            timeThread.stop();
            timeThread=null;
        }
    }
    public void run()
    {
        while(true)
        {
            Calendar time=Calendar.getInstance();//创建类的实例
            year=time.get(Calendar.YEAR);
            month=time.get(Calendar.MONTH);
            day=time.get(Calendar.DAY_OF_MONTH );
            weekday=time.get(Calendar.DAY_OF_WEEK);
            hour=time.get(Calendar.HOUR);
            minute=time.get(Calendar.MINUTE);
            second=time.get(Calendar.SECOND);
            repaint ();
            try
            {	Thread.sleep( 300);		}
            catch (InterruptedException e)
            {  }
        }
    }
    public void paint (Graphics g)
    {
        String s1=year+"年"+month+"月"+day+"日";
        String s2="星期"+weekday;
        String s3=hour+":"+minute+":"+second;
        g.setFont (wordFont);
        g.setColor (Color.green);
        g.drawString (s1, 20, 50);
        g.drawString (s2, 20, 120);
        g.drawString (s3, 20, 200);
    }
}


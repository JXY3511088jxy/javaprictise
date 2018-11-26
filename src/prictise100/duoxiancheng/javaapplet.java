package prictise100.duoxiancheng;

import java.applet.*;
import java.awt.*;

/**
 * 编写小程序实现Runnable接口，通过多线程实现在小程序窗口中不断的显示自然数：从1直到100。
 */
public class javaapplet extends Applet implements Runnable
{
    int counter=0;
    Thread t;
    public void init()
    {
        t=new Thread(this);
        t.start();
    }
    public void run()
    {
        while( counter<100 )
        {
            counter++;
            try
            {	Thread.sleep(100);		}
            catch ( InterruptedException e )
            {		}
            repaint();
        }
    }
    public void paint( Graphics g )
    {
        setBackground(Color.white);
        g.setColor(Color.pink);
        g.setFont(new Font("Times New Roman",Font.BOLD,35));
        g.drawString( String.valueOf(counter),60,60 );
    }
}


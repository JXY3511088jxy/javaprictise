package prictise100;

import java.applet.Applet;
import java.awt.*;

/**
 * 编写一个Applet，其功能为：取一个50~200之间的正随机整数，如果该数为奇数则求它的平方根并转换成float型数后再输出；
 * 如果该数为偶数则求它的平方并输出。
 */
public class Applet3 extends Applet {
    public void paint(Graphics g){
        int k;
        k = 50+(int)(Math.random()*150);
        if (k%2==0){
            g.drawString(""+k+" 的平方等于 "+k*k,20,20);
        }else {
            g.drawString(""+k+" 的平方根约等于 "+(float)Math.sqrt(k),20,20);
        }
    }

}

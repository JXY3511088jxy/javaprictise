package prictise100;



/**
 * 请编写一个Application，其功能为：取一个小于800的正随机整数，将其以如下形式输出：
 *                所取随机数为：***
 *                它的百位数字为：*
 *                它的十位数字为：*
 *                它的个位数字为：*
 */

public class Applet4  {
    public static void main(String[] args) {
        int k;
        k = (int)(Math.random()*800);
        System.out.println("所取随机数为："+k);
        System.out.println("它的百位数字为："+k/100);
        System.out.println("它的十位数字为："+k%100/10);
        System.out.println("它的个位数字为："+k%10);
    }
}

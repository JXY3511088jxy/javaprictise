package prictise100;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

/**
 * 请编写一个Application实现如下功能：接受命令行中给出的一个字母串，先将该串原样输出，然后判断该串的第一个字母是否为大写，
 * 若是大写则统计该串中大写字母的个数，并将所有大写字母输出；否则输出信息串”第一个字母不是大写字母!”。
 */
public class class12 {
    public  static  void  main(String  args[])
    {
        Scanner s = new Scanner(System.in);
        String b;
        System.out.print("请输入一个字母串：");
        b = s.nextLine();
        for (int i=0;i<b.length();i++){
            System.out.print(b.charAt(i));
        }
        int count = 0;
        if ((int)b.charAt(0)>=65&&(int)b.charAt(0)<=90){
            for (int i = 0;i<b.length();i++){
                if ((int)b.charAt(i)>=65&&(int)b.charAt(i)<=90){
                    System.out.println("");
                    System.out.print(b.charAt(i));
                    count++;
                }
            }
            System.out.println(" ");
            System.out.println("共有："+count+"个大写字母。");
        }else {
            System.out.println("第一个字母不是大写字母!");
        }
    }

}

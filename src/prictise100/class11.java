package prictise100;

import java.util.Scanner;

/**
 * 编写应用程序，功能为：从命令行传入一个包含十个字符的字符串，把该字符串与程序中给定的字符串"bacdbcabca"依次比较，
 * 统计两个串中对应字符相等的数目。然后输出命令行输入的字符串，并把两个串中对应字符不相等的字符替换为'@'后生成的新串输出,
 * 最后输出两个串中相等字符的数目。
 */
public class class11 {
    static String a = "bacdbcabca";

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String b;
        System.out.print("请输入一个包含十个字符的字符串：");
        b = s.nextLine();
        int count = 0;
        for (int i= 0;i<a.length();i++){
            if (b.charAt(i)==a.charAt(i)){
                System.out.println(" "+b.charAt(i));
                count++;
            }else {
                System.out.println(" "+"@");
            }
        }
        System.out.println( );
        System.out.println("The correct answers:"+count);
    }
}

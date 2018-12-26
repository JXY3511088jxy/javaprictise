package prictise50;

import javax.xml.transform.Source;
import java.util.Scanner;

/*
请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续判断第二个字母。
 */
public class lianxi26 {
    public static void main(String[] args) {
        getChar tw = new getChar();
        System.out.println("请输入星期的第一个大写字母：");
        char ch = tw.getChar();
        switch (ch){
            case 'M':
                System.out.println("星期一：Monday");
                break;
            case 'W':
                System.out.println("星期三：Wednesday");
                break;
            case 'F':
                System.out.println("星期五：Friday");
                break;
            case 'T':
                System.out.println("请输入第二个字母：");
                char ch2 = tw.getChar();
                if (ch2=='U'){
                    System.out.println("星期二：Tuesday");
                }else if (ch2=='H'){
                    System.out.println("星期四：Thursday");
                }else {
                    System.out.println("无此写法！");
                }
                break;
            case 'S':
                System.out.println("请输入第二个字母：");
                char ch3 = tw.getChar();
                if (ch3=='U'){
                    System.out.println("星期天：sunday");
                }else if (ch3=='A'){
                    System.out.println("星期六：saturday");
                }else {
                    System.out.println("无此写法！");
                }
                break;
            default:
                System.out.println("无此写法！");

        }
    }
}

class getChar{
    public char getChar(){
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        char ch = str.charAt(0);
        if (ch<'A'||ch>'Z'){
            System.out.println("输入错误，请重新输入！");
            //ch=getChar();     //这是答案上多余的，去掉之后不影响程序运行
        }
        return ch;
    }
}
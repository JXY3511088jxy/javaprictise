package prictise50;

/**
 * 求1+2!+3!+...+20!的和
 */
public class lianxi21 {
    public static void main(String[] args) {
        int x=1,y=0;
        for (int i=2;i<=20;i++){
                x*=i;
                y+=x;
        }
        System.out.println("1+2!+3!+...+20!的和为："+y);
    }
}

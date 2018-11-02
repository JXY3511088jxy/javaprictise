package prictise50;

import java.util.Scanner;

/**
 * 利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 */
public class lianxi05 {
    public static void main(String[] args) {
        int x;
        char grade;
        Scanner s = new Scanner(System.in);
        System.out.print("请输入一个成绩：");
        x = s.nextInt();
        grade = x>=90?'A':x>=60?'B':'C';    //这种方式写更加简便。
        if (x>=90){
            grade='A';
        }else if (x>=60){
            grade='B';
        }else {
            grade='C';
        }
        System.out.println("学生成绩等级为："+grade);
    }
}

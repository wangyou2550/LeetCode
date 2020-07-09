package meituan;

import java.util.Scanner;
/** 
 * @Description:  
 * @Author: wangyou
 * @Date: 2020/7/8
 */
/**
 * @Description:  给出两个字符串，分别是模式串P和目标串T，
 * 判断模式串和目标串是否匹配，匹配输出 1，不匹配输出 0。
 * 模式串中‘？’可以匹配目标串中的任何字符，模式串中的 ’*’
 * 可以匹配目标串中的任何长度的串，
 * 模式串的其它字符必须和目标串的字符匹配。例如P=a?b，T=acb，则P 和 T 匹配
 * @Param: 
 * @Return: 
 */
/**
 * @Description:
 */
public class Problem2 {
    public  static int match(String p,String t){
        boolean res=match(p,t,0,0);
        return res?1:0;
    }

    private static boolean match(String p, String t, int i, int j) {
        if(i==p.length()&&j==t.length())return true;
        if(i==p.length()||j==t.length())return  false;
        if(p.charAt(i)=='?'||p.charAt(i)==t.charAt(j)) return match(p,t,i+1,j+1);
        if(p.charAt(i)=='*')return match(p,t,i,j+1)||match(p,t,i+1,j)||match(p,t,i+1,j)||match(p,t,i+1,j+1);
        return false;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String p =sc.nextLine();
        String t=sc.nextLine();
        System.out.println(match(p,t));
    }
}

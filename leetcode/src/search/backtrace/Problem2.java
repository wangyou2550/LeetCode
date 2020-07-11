package search.backtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: IP 地址划分
 * @Author: wangyou
 * @Date: 2020/7/9
 */
/*思路:
* 第一步:
*结果使用List<String>保存,中间的值用StringBulider保存
* 递归截至条件: 有四组值了,且当前的索引等于字符串的长度
* 遍历过程:
* 取0,1,2三个数,判断是否在0到255范围内
* */
public class Problem2 {
    public List<String> restoreIpAddress(String s){
        List<String>res=new ArrayList<>();
        StringBuilder sb=new StringBuilder();
        if(s==null||s.length()==0)return res;
        backTrace(s,res,sb,0,0);
        return res;
    }

    private void backTrace(String s, List<String> res, StringBuilder sb, int i,int cnt) {
//       递归截至条件
        if(i==s.length()&&cnt==4){
            res.add(sb.toString().substring(0,sb.length()-1));
        }
        if(i>s.length()||cnt>4)return;

        for (int j = 1; j <=3 ; j++) {
            if(i+j<=s.length()){
                String s1=s.substring(i,i+j);
                if(valid(s1)){
                    sb.append(s1+".");
                    backTrace(s,res,sb,i+j,cnt+1);
                    sb.delete(sb.length()-j-1,sb.length());

                }
            }

        }
    }

    private boolean valid(String s) {
        int n=s.length();
        int sum=0;
        for (int i = 0; i <n ; i++) {
            sum=(s.charAt(i)-'0')+sum*10;
        }
        return sum<=255&&sum>0;

    }

    public static void main(String[] args) {
        Problem2 p=new Problem2();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            System.out.println(p.restoreIpAddress(s));
        }
    }

}

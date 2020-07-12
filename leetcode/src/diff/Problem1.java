package diff;

import sun.font.FontRunIterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 分治法,给表达式加括号
 * @Author: wangyou
 * @Date: 2020/7/11
 */
//思路:分治
//碰到符号:算出左边结果,在算出右边的结果,然后组合起来.当wayssize==0,将字符串的值变为整数加入队里;

public class Problem1 {
    public List<Integer> diffWaysToComputer(String input){
        List<Integer>ways=new ArrayList<>();
        for (int i = 0; i <input.length() ; i++) {
            char c=input.charAt(i);
            if(c=='+'||c=='-'||c=='*'){
                List<Integer>left=diffWaysToComputer(input.substring(0,i));
                List<Integer>right=diffWaysToComputer(input.substring(i+1));
                for(int l:left){
                    for(int r:right){
                        ways.add(compute(c,l,r));
                    }
                }
            }


        }
        if(ways.size()==0){
            ways.add(Integer.valueOf(input));
        }
        return ways;
    }
    public int compute(char c,int a,int b){
        if(c=='+')return a+b;
        if(c=='-')return a-b;
        if(c=='*')return a*b;
        return 0;
    }
}

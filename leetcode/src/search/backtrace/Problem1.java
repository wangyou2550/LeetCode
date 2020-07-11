package search.backtrace;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//组合回溯问题：一个列表保存现场，递归完后恢复现场
public class Problem1 {
    private static final String[] KEYS = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public List<String> letterCombinations(String digits){
        List<String>res=new ArrayList<>();
        if(digits==null||digits.length()==0)return res;
        StringBuilder sb=new StringBuilder();
        backTrace(sb,digits,0,res);
        return res;

    }

    private void backTrace(StringBuilder sb, String digits, int i, List<String> res) {
//       递归截至条件
        if(i==digits.length()){
            res.add(sb.toString());
            return;
        }
        String s=KEYS[digits.charAt(i)-'0'];
        for (int j = 0; j <s.length() ; j++) {
            sb.append(s.charAt(j));
            backTrace(sb,digits,i+1,res);
            sb.deleteCharAt(sb.length()-1);//恢复现场
        }

    }

    public static void main(String[] args) {
        Problem1 p=new Problem1();
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String digits=sc.nextLine();
            System.out.println(p.letterCombinations(digits));
        }
    }
}

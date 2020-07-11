package search.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 分割字符串是的每个部分都是回文数
 * @Author: wangyou
 * @Date: 2020/7/10
 */

public class Problem13 {
    public List<List<String>>partion(String s){
        List<List<String>>res=new ArrayList<>();
        List<String>list=new ArrayList<>();
        if(s==null||s.length()==0)return res;
        backtrace(res,list,s);
        return res;
    }

    private void backtrace(List<List<String>> res, List<String> list, String s) {
        if(0==s.length()){
            res.add(list);
            return;
        }
        for (int i = 0; i <s.length() ; i++) {
            if(isPalindrome(s,0,i)){
                list.add(s.substring(0,i+1));
                backtrace(res,list,s.substring(i+1));
                list.remove(list.size()-1);
            }

        }


    }

    private boolean isPalindrome(String s, int i, int j) {
        while(i<j){
            if(s.charAt(i++)!=s.charAt(j--))
                return false;
        }
        return true;
    }

}

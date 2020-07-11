package search.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 从 1-9 数字中选出 k 个数不重复的数，使得它们的和为 n
 * @Author: wangyou
 * @Date: 2020/7/10
 */
public class Problem10 {
    public List<List<Integer>>combinationSum3(int k,int n){
        List<List<Integer>>res=new ArrayList<>();
        if(k<=0||n==0||k>n)return res;
        List<Integer>list=new ArrayList<>();
        backTrace(res,list,k,n,1);
        return res;
    }

    private void backTrace(List<List<Integer>> res, List<Integer> list, int k, int n,int start) {
            if(k==0&&n==0){
                res.add(new ArrayList<>(list));
                return;
            }
            if(k==0||n==0)return;
        for (int i = start; i <=9 ; i++) {
            if(i>n)continue;
            list.add(i);
            backTrace(res,list,k-1,n-i,i+1);
            list.remove(list.size()-1);
        }

    }

    public static void main(String[] args) {
        Problem10 p=new Problem10();
        System.out.println(p.combinationSum3(3,9));
    }
}

package search.backtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 相同元素组合求和
 * @Author: wangyou
 * @Date: 2020/7/10
 */
public class Problem9 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        if(candidates==null||candidates.length==0)return res;
        List<Integer>list=new ArrayList<>();
        Arrays.sort(candidates);
        boolean[]vis=new boolean[candidates.length];
        backtrace(candidates,res,list,target,0,vis);
        return res;

    }

    private void backtrace(int[] candidates, List<List<Integer>> res, List<Integer>list,int target, int start,boolean[]vis) {
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <candidates.length ; i++) {
            if(i>0&&candidates[i-1]==candidates[i]&&!vis[i-1])continue;
            if(target>=candidates[i]){
                list.add(candidates[i]);
                vis[i]=true;
                backtrace(candidates,res,list,target-candidates[i],i+1,vis);
                list.remove(list.size()-1);
                vis[i]=false;

            }

        }
    }

    public static void main(String[] args) {
        Problem9 p=new Problem9();
        int[]nums={10,1,2,6,1,5};
        System.out.println(p.combinationSum(nums,8));
    }
}

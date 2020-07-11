package search.backtrace;

import java.util.ArrayList;
import java.util.List;


/**
 * @Description: 排列
 * @Author: wangyou
 * @Date: 2020/7/10
 */
/*先选一个,在到之后在选一个
dfs:
截至条件:当list的size==nums的size
递归:
1:先判断是否被访问过
2:改变现场
3回溯
4修复现场*/
public class Problem5 {
    private int n;
    public List<List<Integer>>permute(int[]nums){
        List<List<Integer>>res=new ArrayList<>();
        if(nums==null||nums.length==0)return res;
        List<Integer>list=new ArrayList<>();
        boolean[]vis=new boolean[nums.length];
        backTrace(res,list,vis,nums);
        return res;
    }

    private void backTrace(List<List<Integer>> res, List<Integer> list, boolean[] vis, int[] nums) {
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(!vis[i]){
                vis[i]=true;
                list.add(nums[i]);
                backTrace(res,list,vis,nums);
                list.remove(list.size()-1);
                vis[i]=false;
            }

        }
    }

    public static void main(String[] args) {
        Problem5 p=new Problem5();
        int[]nums={1,2,3};
        System.out.println(p.permute(nums));
    }

}

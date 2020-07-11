package search.backtrace;
/**
 * @Description: 含有相同元素求排列
 * @Author: wangyou
 * @Date: 2020/7/10
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//思路:
//        排序
//在排列的基础增加一个判断条件,nums[i]!=nums[i-1]
public class Problem6 {
    private int n;
    public List<List<Integer>>permute(int[]nums){
        List<List<Integer>>res=new ArrayList<>();
        if(nums==null||nums.length==0)return res;
        List<Integer>list=new ArrayList<>();
        boolean[]vis=new boolean[nums.length];
        Arrays.sort(nums);
        backTrace(res,list,vis,nums);
        return res;
    }

    private void backTrace(List<List<Integer>> res, List<Integer> list, boolean[] vis, int[] nums) {

        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if(vis[i]||(i!=0&&nums[i]==nums[i-1])&&!vis[i-1])continue;

                vis[i]=true;
                list.add(nums[i]);
                backTrace(res,list,vis,nums);
                list.remove(list.size()-1);
                vis[i]=false;


        }
    }

    public static void main(String[] args) {
        Problem6 p=new Problem6();
        int[]nums={1,1,3};
        System.out.println(p.permute(nums));
    }
}

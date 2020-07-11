package search.backtrace;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Description: 含有相同元素求子集
 * @Author: wangyou
 * @Date: 2020/7/10
 */
public class Problem12 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        if(nums==null||nums.length==0)return res;
        List<Integer>list=new ArrayList<>();
        res.add(new ArrayList<>(list));
        boolean []vis=new boolean[nums.length];
        Arrays.sort(nums);
        backTrace(res,list,nums,0,vis);
        return res;

    }

    private void backTrace(List<List<Integer>> res, List<Integer> list, int[] nums, int start, boolean []vis) {
        if(list.size()==nums.length){
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]&&!vis[i-1])continue;
            list.add(nums[i]);
            vis[i]=true;
            res.add(new ArrayList<>(list));
            backTrace(res,list,nums,i+1,vis);
            list.remove(list.size()-1);
            vis[i]=false;
        }
    }
    public static void main(String[] args) {
        Problem12 p=new Problem12();
        int[]nums={1,2,2};
        System.out.println(p.subsets(nums));
    }
}

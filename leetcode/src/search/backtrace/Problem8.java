package search.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 组合求和
 * @Author: wangyou
 * @Date: 2020/7/10
 */
/*截至条件,target==0
递归的循环条件:从起始位置到末尾
进入现场:
list.add;
target-nums[i];
回溯:bbacktrace(start,target);
恢复现场*/
public class Problem8 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>res=new ArrayList<>();
        if(candidates==null||candidates.length==0)return res;
        List<Integer>list=new ArrayList<>();
        backtrace(candidates,res,list,target,0);
        return res;

    }

    private void backtrace(int[] candidates, List<List<Integer>> res, List<Integer>list,int target, int start) {
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <candidates.length ; i++) {
            if(target>=candidates[i]){
                list.add(candidates[i]);
                backtrace(candidates,res,list,target-candidates[i],i);
                list.remove(list.size()-1);
            }

        }
    }

    public static void main(String[] args) {
        Problem8 p=new Problem8();
        int[]nums={2,3,5};
        System.out.println(p.combinationSum(nums,8));
    }


}

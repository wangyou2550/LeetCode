package search.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 找出集合的所有子集，子集不能重复，[1, 2] 和 [2, 1] 这种子集算重复
 * @Author: wangyou
 * @Date: 2020/7/10
 */
/*思路:
  截至条件      list.size==nums.size,加入;
  递归
  for中start到最后
  list.add
  回溯
  重置现场
        */
public class Problem11 {
    public List<Integer> numToList(int[]nums,int n){
        List<Integer>list=new ArrayList<>();
        int cnt=0;
        while(n>0){
            if(n%2==1)list.add(nums[cnt]);
            n=n/2;
            cnt++;
        }
        return list;
    }
    public List<List<Integer>> subsets1(int []nums){
        List<List<Integer>> res=new ArrayList<>();
        if(nums==null||nums.length==0)return res;
        for (int i = 0; i <1<<nums.length ; i++) {
            res.add(numToList(nums,i));
        }
        return res;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>res=new ArrayList<>();
        if(nums==null||nums.length==0)return res;
        List<Integer>list=new ArrayList<>();
        res.add(new ArrayList<>(list));
        backTrace(res,list,nums,0);
        return res;

    }

    private void backTrace(List<List<Integer>> res, List<Integer> list, int[] nums, int start) {
        if(list.size()==nums.length){
//            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<nums.length;i++){
            list.add(nums[i]);
            res.add(new ArrayList<>(list));
            backTrace(res,list,nums,i+1);
            list.remove(list.size()-1);
        }
   }

    public static void main(String[] args) {
        Problem11 p=new Problem11();
        int[]nums={1,2,3};
        System.out.println(p.subsets1(nums));
    }
}

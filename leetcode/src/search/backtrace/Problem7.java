package search.backtrace;

import tree.recursion.Problem;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 组合
 * @Author: wangyou
 * @Date: 2020/7/10
 */
/*思路:
截至条件,当list的size==k的时候,截止
递归:记录一个起始地址,循环的条件为起始地址到n-k+1;
进入现场,加入list
回溯
恢复现场*/

public class Problem7 {

    public List<List<Integer>> combin(int n, int k){
        List<List<Integer>>res=new ArrayList<>();
        if(n<=0||k<=0||n<k)return res;
        List<Integer>list=new ArrayList<>();
        bactrace(res,list,n,k,1);
        return res;

    }

    private void bactrace(List<List<Integer>> res, List<Integer> list, int n, int k, int start) {
            if(k==0){
                res.add(new ArrayList<>(list));
                return;
            }
            for(int i=start;i<=n-k+1;i++){
                list.add(i);
                bactrace(res,list,n,k-1,i+1);
                list.remove(list.size()-1);
            }
    }

    public static void main(String[] args) {
        Problem7 p=new Problem7();
        System.out.println(p.combin(4,2));
    }
}

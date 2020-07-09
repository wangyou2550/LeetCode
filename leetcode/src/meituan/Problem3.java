package meituan;
/** 
 * @Description:  
 * @Author: wangyou
 * @Date: 2020/7/8
 */
/**
 * @Description: 打车派单场景, 假定有N个订单， 待分配给N个司机。每个订单在匹配司机前，会对候选司机进行打分，打分的结果保存在N*N的矩阵A， 其中Aij 代表订单i司机j匹配的分值。
 * 假定每个订单只能派给一位司机，司机只能分配到一个订单。求最终的派单结果，使得匹配的订单和司机的分值累加起来最大，并且所有订单得到分配
 * @Param: 
 * @Return: 
 */

//doule值的小数点四舍五入没有搞定
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Description: 用dfs搜索，像组合那种题那样做
 */
public class Problem3 {
    private static int n;
    private double max;
    private List<Integer> res=new ArrayList<>();
    public void bestAttibute(double[][]nums){
        boolean []vis=new boolean[n];
        List<Integer> list=new ArrayList<>();
        dfs(nums,vis,list,0,0);
        System.out.println(max);
        for (int i = 0; i <n ; i++) {
            System.out.println(res.get(2*i)+" "+res.get(2*i+1));
        }

    }
//递归截至条件
    private void dfs(double[][] nums, boolean[] vis, List<Integer> list, int row,double sum) {
        if(row==n){
            BigDecimal b=new BigDecimal(sum);
            sum=b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
            if(sum>max){
                res=new ArrayList<>(list);
                max=sum;
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            if(!vis[i]){
                vis[i]=true;
                list.add(row+1);
                list.add(i+1);
                dfs(nums,vis,list,row+1,sum+nums[row][i]);
                vis[i]=false;
                list.remove(list.size()-1);
                list.remove(list.size()-1);
            }

        }

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

         n=sc.nextInt();
        double [][]nums=new double[n][n];
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j <n ; j++) {
                nums[i][j]=sc.nextDouble();
            }
        }
        Problem3 p=new Problem3();
        p.bestAttibute(nums);
    }

}

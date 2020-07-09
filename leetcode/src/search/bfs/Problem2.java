package search.bfs;

import tree.recursion.Problem;

import java.util.*;

/**
 * @Description: 组成整数的最小平方数数量
 * @Author: wangyou
 * @Date: 2020/7/9
 */
/*思路
* 建立平方数数组，每次入队当前数减去数组中的某个数，当第一次发现从队列出来的数等于0，
* 返回当前统计的入队次数
* */
public class Problem2 {
    public int numSquares(int n){
        if(n<=0)return -1;
        List<Integer> squres=new ArrayList<>();
        for (int i = 1; i*i <=n ; i++) {
            squres.add(i*i);
        }
        Queue<Integer>queue=new LinkedList<>();
        queue.add(n);
        int res=0;
        while(!queue.isEmpty()){
            res++;
            int size=queue.size();
            for (int i = 0; i < size; i++) {
                int cur=queue.poll();
                for(int s:squres){
                    if(cur==s)return res;
                    if(s<cur)queue.add(cur-s);
                }

            }

        }
        return -1;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Problem2 p=new Problem2();
        while(sc.hasNext()){
            int n=sc.nextInt();
            System.out.println(p.numSquares(n));
        }
    }
}

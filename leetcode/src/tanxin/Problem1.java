package tanxin;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

/**
 * @Description: 贪心:分配饼干
 * @Author: wangyou
 * @Date: 2020/7/11
 */
public class Problem1 {
    public int maxCount(int[]grid,int[]size){
        if(grid==null||size==null)return 0;
        Arrays.sort(grid);
        Arrays.sort(size);
       int gi=0,si=0;
       while(gi<grid.length&&si<size.length){
           if(grid[gi]<=size[si])gi++;
           si++;
       }
        return gi;
    }

    public static void main(String[] args) {
        Problem1 p=new Problem1();
        int[]grid={1,3};
        int[]size={1,2,4};
        System.out.println(p.maxCount(grid,size));
    }
}

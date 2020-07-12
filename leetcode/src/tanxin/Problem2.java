package tanxin;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Description: 计算让一组区间不重叠所需要移除的区间个数
 * @Author: wangyou
 * @Date: 2020/7/11
 */
//思路:
//遍历数组,排序;
//然后遍历pre,
public class Problem2 {
    public int removeRange(int[][]intervals){
        if(intervals.length==0)return 0;
        Arrays.sort(intervals, new Comparator<int[]>() {

            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1]-o2[1];
            }
        });
        int cnt=1;
        int end=intervals[0][1];
        for (int i = 1; i <intervals.length ; i++) {
            if(intervals[i][0]<end)continue;
            end=intervals[i][1];
            cnt++;
        }
        return intervals.length-cnt;


    }
}

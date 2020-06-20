package matrix;

import java.util.HashMap;
import java.util.Map;

public class FindShortestSubArray {
    public int findShortestSubArray(int []nums){
        Map<Integer,Integer> numsCnt=new HashMap<>();
        Map<Integer,Integer> numsLastCnt=new HashMap<>();
        Map<Integer,Integer> numsFirstCnt=new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            int num=nums[i];
            numsCnt.put(num,numsCnt.getOrDefault(num,0)+1);
            if(!numsFirstCnt.containsKey(num)){
                numsFirstCnt.put(num,i);
            }
            numsLastCnt.put(num,i);

        }
        int maxCnt=0;
        for(int nu:nums){
            maxCnt=Math.max(maxCnt,numsCnt.get(nu));
        }
        int ret=0;
        for (int j = 0; j < nums.length; j++) {
            if(numsCnt.get(nums[j])!=maxCnt)continue;
            ret= numsLastCnt.get(nums[j])-numsFirstCnt.get(nums[j])+1;
        }
        return ret;

    }


}

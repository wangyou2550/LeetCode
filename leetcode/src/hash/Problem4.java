package hash;

import java.util.HashMap;

public class Problem4 {
    public int longestConsective(int[]nums){
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int num:nums){
            map.put(num,1);
        }
        for(int num:nums){
            forward(map,num);
        }
        return maxCount(map);
    }

    private int maxCount(HashMap<Integer, Integer> map) {
        int max = 0;
        for (Integer key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        return max;
    }

    private int  forward(HashMap<Integer, Integer> map, int num) {
        if(!map.containsKey(num))return 0;
        int cnt=map.get(num);
        if(cnt>1)return cnt;
        cnt=forward(map,num+1)+1;
        map.put(num,cnt);
        return cnt;
    }
}

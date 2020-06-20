package hash;

import java.util.HashSet;

public class Problem2 {
    public boolean containsDuplicate(int[]nums){

        HashSet<Integer>set=new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        return set.size()<nums.length;

    }
}

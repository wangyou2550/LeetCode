package matrix;

public class FindMaxConsecutivesOnes {
    public static int findMaxConsecutiveOnes(int[]nums){
        int cur=0,max=0;
        for (int num : nums) {
            cur=num==1?cur+1:0;
            max=Math.max(cur,max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[]nums={1,0,1,1,1,1,4,6,1,33,1,1,1,24};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

}

package struct.bit;

public class MissingNumber {
    public static int missNumber(int[]nums){
        int len=nums.length;
        int ret=0;
        for (int i = 0; i < len; i++) {
            ret^=(i^nums[i]);

        }
        return ret^len;
    }

    public static void main(String[] args) {
        int[]nums={3,0,1};
        System.out.println(missNumber(nums));
    }
}

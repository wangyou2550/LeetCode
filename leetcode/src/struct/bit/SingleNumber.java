package struct.bit;

public class SingleNumber {
    public static int sigleNumber(int[]nums){
        int ret=0;
        for (int num : nums) {
            ret^=num;
        }
        return ret;
    }

    public static void main(String[] args) {
        int[]nums={4,1,1,2,2};
        System.out.println(sigleNumber(nums));
    }


}

package struct.bit;

public class SingleNumber2 {
    public static int[] singleNumber2(int[]nums){
        int[]ret=new int[2];
        int diff=0;
        for (int num : nums) {
            diff^=num;
        }
        diff&=(-diff);//得到最低位为1的数
        for (int num : nums) {
            if((num&diff)==0)ret[0]^=num;
            else ret[1]^=num;
        }
        return ret;


    }

    public static void main(String[] args) {
        int[]nums={1,1,2,4,3,3,8,8};
        for (int num:singleNumber2(nums)){
            System.out.println(num);
        }
    }
}

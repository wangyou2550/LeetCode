package matrix;

public class ArrayNesting {
    //暴力解法:解法说明：元素没有重复，说明只能是成环，没有突出，所以凡是成环的，它们的链
//    都一样长
    public static int arrayNesting(int[]nums){
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==Integer.MAX_VALUE)continue;
            int start = nums[i], count = 1;
            nums[i]=Integer.MAX_VALUE;

            while (start != i){
                int temp=start;
                start = nums[start];
                count++;
                nums[temp]=Integer.MAX_VALUE;
            }
            res = Math.max(res, count);

        }
        return res;
    }

    public static void main(String[] args) {

        System.out.println(arrayNesting(new int[]{5,4,0,3,1,6,2}));
    }
}

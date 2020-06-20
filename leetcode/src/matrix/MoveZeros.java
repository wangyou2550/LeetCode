package matrix;

public class MoveZeros {
    public static void moveZeros(int[]nums){
        int index=0;
        for (int num : nums) {
            if(num!=0){
                nums[index++]=num;
            }
        }
        while(index<nums.length){
            nums[index++]=0;
        }
    }

    public static void main(String[] args) {
        int []nums={1,2,3,0,2,4,0,1};
        for (int num : nums) {
            System.out.print(num);
        }
        moveZeros(nums);
        System.out.println("   ");
        for (int num : nums) {
            System.out.print(num);
        }
    }
}

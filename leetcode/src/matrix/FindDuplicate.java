package matrix;

public class FindDuplicate {
    //找出数组中重复的数，数组在[1,n]之间
    public int findDuplicate(int[]nums){
        int l=1,h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            int cnt=0;
            for (int i = 0; i <nums.length ; i++) {
                if(nums[i]<mid)cnt++;
            }
            if(cnt>mid)h=mid-1;
            else l=mid+1;
        }
        return l;

    }
//    双指针解法，类似于有环链表中找出环的入口：
    public int findDuplication2(int[]nums){
        int slow=nums[0],fast=nums[nums[0]];
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[nums[fast]];
        }
        fast=0;
        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }
        return slow;

    }
}

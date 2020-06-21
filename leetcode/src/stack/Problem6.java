package stack;

import java.util.Arrays;
import java.util.Stack;

public class Problem6 {
    public int[]nextGreaterElements(int[]nums){
        int n=nums.length;
        int[]next=new int[n];
        Arrays.fill(next,-1);
        Stack<Integer>index=new Stack<>();
        for (int i = 0; i <n*2 ; i++) {
            int num=nums[i%n];
            while(!index.isEmpty()&&nums[index.peek()]<num){

                next[index.pop()]=num;
            }
            if(i<n){
                index.push(i);
            }
        }
        return next;
    }
}

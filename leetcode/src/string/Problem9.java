package string;

//将连续的1和0分组，取这两个分组的最小数
//具体的,让两个值记录分组里面01的数量，当前后两个数字不同的时候，计算前面两个组能组成的数，然后第二组
//的数变为第一组的数，第一组的数量为1；

public class Problem9 {
    public int countBinarySubstrings(String s) {
        int cnt=0,cur=1,pre=0;
        for (int i = 1; i <s.length() ; i++) {
            if(s.charAt(i-1)!=s.charAt(i)){
                cnt+=Math.min(cur,pre);
                cur=1;
                pre=cur;
            }else{
                cur++;
            }


        }
        return cnt+Math.min(pre,cur);
    }
}

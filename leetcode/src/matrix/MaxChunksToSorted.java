package matrix;

public class MaxChunksToSorted {
    //超出时间限制，分块，后面的数据有比初始小的，把最后一个比起始小的这一块合成一堆

    public int maxChunksToSorted(int[] arr) {
        int n=arr.length-1;
        int cnt=0,start=0;
        while(start<=n){
            int end=0;
            for (int j = start+1; j <arr.length ; j++) {
                if(arr[j]<arr[start])end=j;
            }
            cnt++;
            start=end+1;
        }
    return cnt;

    }
    public int maxChunk(int[]arr){
        int res=0,max=0;
        for (int i = 0; i <arr.length ; i++) {
            max=Math.max(arr[i],max);
            if(max==i)res++;
        }
        return res;


    }


}

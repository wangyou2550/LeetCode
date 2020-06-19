package struct.bit;

public class CountBits {
    public static int[]countBits(int num){
        int[] res=new int[num+1];
        for (int i = 1; i <=num ; i++) {
            res[i]=res[(i&(i-1))]+1;// i比i&(i-1)多一个1
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(countBits(5)[5]);
    }
}

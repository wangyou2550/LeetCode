package struct.bit;

public class HammingDistance {
    public static int hammingDistance(int x,int y){
        int z=x^y;
        int cnt=0;
        while(z!=0){
            z&=(z-1);
            cnt++;
        }
//        while(z!=0){
//            if((z&1)==1)cnt++;
//            z=z>>1;
//        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,2));
    }
}

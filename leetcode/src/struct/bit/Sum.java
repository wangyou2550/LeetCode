package struct.bit;

public class Sum {
    public static int getSum(int a,int b){
        return b==0?a:getSum(a^b,(a&b)<<1);
    }

    public static void main(String[] args) {
        System.out.println(getSum(1,5));
    }
}

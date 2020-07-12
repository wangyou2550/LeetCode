package diff;

public class BinaryIndexTree {
    static int[] c;
    int n;
    public BinaryIndexTree(int n){
        this.n=n;
        c=new int[n+1];

    }
    int lowbit(int x){
        return x&(x^(x-1));
    }
    void update(int p,int d){
        while(p<=n){
            c[p]+=d;
            p+=lowbit(p);
        }
    }
    int sum(int p){
        int ret=0;
        while(p>0){
            ret+=c[p];
            p-=lowbit(p);

        }
        return ret;
    }
    int sum(int s,int e){
        if(s>n||e<1||s>e||s<1||e>n)return -1;
        return sum(e)-sum(s);
    }

    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7,8,9};
        BinaryIndexTree bit=new BinaryIndexTree(nums.length);
        for (int i = 0; i < nums.length; i++) {
            bit.update(i+1,nums[i]);
        }
    }
}

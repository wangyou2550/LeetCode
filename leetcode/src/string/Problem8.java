package string;
//判断一个整数是否是回文数
//        要求不能使用额外空间，也就不能将整数转换为字符串进行判断。
//        将整数分成左右两部分，右边那部分需要转置，然后判断这两部分是否相等。
public class Problem8 {
    public boolean isPalindrome(int x){
        if(x<0)return false;
        if(x<10)return true;
        int y=0;
        while(x>y){

            int t=x%10;
            x=x/10;
            y=y*10+t;
        }
        return x==y||x==y%10;
    }



    public static void main(String[] args) {
        Problem8 p=new Problem8();
        System.out.println(p.isPalindrome(101));
    }
}

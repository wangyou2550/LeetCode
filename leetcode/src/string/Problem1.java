package string;
/**
 * @Description: 字符串循环位移位移包含
 */
public class Problem1 {
    public boolean isChild(String s,String t){
        char start=t.charAt(0);
        boolean res=false;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)==start){
                res|=check(s,t,i);
                if(res)return true;
            }

        }
        return false;
    }

    private boolean check(String s, String t, int i) {
        int n=s.length();
        int l=0;
        while(s.charAt(i++)==t.charAt(l++)){
            if(i==s.length())i=0;
            if(l==t.length())return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Problem1 problem1 = new Problem1();
        System.out.println(problem1.isChild("AABCD","CBAD"));
    }
}

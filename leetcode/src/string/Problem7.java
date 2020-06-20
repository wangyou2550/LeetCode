package string;

public class Problem7 {
    int cnt=0;
    public int countSubString(String s){
        for (int i = 0; i <s.length() ; i++) {
            extension(s,i,i);
            extension(s,i,i+1);

        }
        return cnt;
    }

    private void extension(String s, int i, int i1) {

        while(i>=0&&i1<s.length()){
            if(s.charAt(i)==s.charAt(i1)){
                cnt++;
                i--;
                i1++;
            }
        }
    }

    public static void main(String[] args) {
        Problem7 p=new Problem7();
        System.out.println(p.countSubString("aaa"));
    }
}

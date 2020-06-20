package string;

public class Problem2 {
    public String move(String s1,int k){
        char[] s = s1.toCharArray();
        reverse(s,0,s.length-k-1);
        reverse(s,s.length-k,s.length-1);
        reverse(s,0,s.length-1);
        return new String(s);
    }

    private void reverse(char[] s, int l, int h ) {
        while(l<h){
            char temp=s[l];
            s[l]=s[h];
            s[h]=temp;
            l++;
            h--;

        }
    }

    public static void main(String[] args) {
        Problem2 p= new Problem2();
        System.out.println(p.move("abcd123",3));
    }
}

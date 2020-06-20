package string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Problem3 {
    public String reverse1(String s){
        char []chars=s.toCharArray();
        int start=0,end=0;
        for (int i = 0; i < chars.length; i++) {
            if(chars[i]==' '){
                end=i-1;
                reverse(chars,start,end);
                start=i+1;
            }
            if(i==chars.length-1){

                reverse(chars,start,i);
            }
        }
        reverse(chars,0,chars.length-1);
        return new String(chars);
    }

    private void reverse(char[] s, int l, int h) {
        while(l<h){
            char temp=s[l];
            s[l]=s[h];
            s[h]=temp;
            l++;
            h--;

        }
    }

    public static void main(String[] args) {
        Problem3 p=new Problem3();
        System.out.println(p.reverse1("I am a student"));
    }
}

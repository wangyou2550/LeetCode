package string;

public class Problem5 {
    //计算一组字符集合可以组成的回文字符串的最大长度
    public int longestPalindrome(String s){
        int res=0;
        int []cnts=new int[256];
        for (char c : s.toCharArray()) {
            cnts[c]++;
        }
        for (int cnt : cnts) {
            res+=(cnts[cnt]/2)*2;
        }
//        for (int i = 0; i <s.length() ; i++) {
//            cnts[s.charAt(i)]++;
//        }
//
//        for (int i = 0; i <cnts.length ; i++) {
//            res+=(cnts[i]/2)*2;
//        }
        if(res<s.length()){
            res++;
        }
        return res;
    }
}

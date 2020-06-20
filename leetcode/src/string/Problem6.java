package string;

public class Problem6 {
    /**
     * @Description: 字符串同构，记录一个字符上次出现的位置，如果两个字符串中的字符上次出现的位置一样，那么就属于同构。 
     */
    public boolean isIsomorphic(String s ,String t){
        int[] preIndexs=new int[256];
        int[] preIndext=new int[256];
        for (int i = 0; i <s.length() ; i++) {
            char sc=s.charAt(i);
            char tc=t.charAt(i);
            if(preIndexs[sc]!=preIndext[tc])return false;
            preIndexs[sc]=i;
            preIndexs[tc]=i;
        }
        return true;
    }
}

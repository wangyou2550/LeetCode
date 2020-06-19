package struct.bit;

public class maxProduct {
    public int maxProduct(String[]words){
       int n=words.length;
       int[]val=new int[n];
        for (int i=0;i<n;i++) {
            for (char c : words[i].toCharArray()) {
                val[i]|=(c-'a');
            }
        }
        int ret=0;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j < n; j++) {
                if((val[i]&val[j])==0){
                    ret=Math.max(words[i].length()*words[j].length(),ret);
                }

            }

        }
        return ret;
    }
}

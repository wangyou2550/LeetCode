package string;

public class Problem4 {
    public boolean isAngrame(String s,String t){
        int[]nums=new int[26];
        for (int i = 0; i < s.length(); i++) {
            nums[s.charAt(i)-'a']++;

        }
        for (int i = 0; i < t.length(); i++) {
            nums[t.charAt(i)-'a']--;

        }
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]!=0)return false;

        }
        return true;
    }

    public static void main(String[] args) {
        Problem4 p=new Problem4();
        System.out.println(p.isAngrame("anagram", "nagaram"));
    }
}

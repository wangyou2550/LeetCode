package meituan;

import java.util.*;

import static java.util.Arrays.sort;

/**
 * @Description:  已知一种新的火星文的单词由英文字母（仅小写字母）组成
 * ，但是此火星文中的字母先后顺序未知。
 * 给出一组非空的火星文单词，且此组单词已经按火星文字典序进行好了排序（从小到大），
 * 请推断出此火星文中的字母先后顺序
 * @Author: wangyou
 * @Date: 2020/7/8
 */
/**
 * @Description:
 * @Param: wrt wrf er ett rftt
 * @Return:
 */
public class Problem5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[]input=sc.nextLine().split(" ");
        mysort(input);

    }

    private static void mysort(String[] input) {
        Map<Character, Set<Character>> map=new HashMap<>();

        Set<Character>set=new HashSet<>();
        for (String s : input) {
            for (int i = 0; i < s.length(); i++) {
                char c=s.charAt(i);
                set.add(c);
                if(!map.containsKey(c)){
                    map.put(c,new HashSet<>());
                }
                for (int j = i+1; j <s.length() ; j++) {
                    if(s.charAt(j)!=c)map.get(c).add(s.charAt(j));
                }
            }
        }
        String[]res=new String[set.size()];
        for (Character character : map.keySet()) {
            Set<Character> set1=map.get(character);
            Set<Character> set2=new HashSet<>();
            set2.addAll(set1);
            for (Character o : set1) {
                if(map.get(o).contains(character)){
                    System.out.println("invalid");
                    return;
                }
               set2.addAll(map.get(o));
            }
            res[set2.size()]=res[set2.size()]+character;
        }
        for (int i = res.length-1; i >=0; i--) {
            if(res[i]!=null){
                System.out.print(res[i]);
            }


        }

    }

}

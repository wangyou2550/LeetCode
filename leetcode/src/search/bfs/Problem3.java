package search.bfs;

import java.util.*;

/**
 * @Description: 最短单词路径 
 * @Author: wangyou
 * @Date: 2020/7/9
 */
//思路;bfs:把相差一个的入队，然后通过从队列中移除掉它，表示以访问过，不在访问
//    删除不可靠，置标志位吧
public class Problem3 {
    public int ladderLength(String start, String end, List<String> wordList){
        if(wordList==null||wordList.size()==0)return 0;
        Queue<String>queue=new LinkedList<>();
        boolean []vis=new boolean[wordList.size()];
        queue.add(start);
        int res=0;
        while(!queue.isEmpty()){
            res++;
            int size=queue.size();
            for (int i = 0; i <size ; i++) {
                String cur=queue.poll();
                for (int j = 0; j <wordList.size() ; j++) {
                    if(vis[j])continue;
                    String s=wordList.get(j);
                    if(oneDiff(cur,s)){
                        if(s.equals(end))return res+1;
                        vis[j]=true;
                        queue.add(s);
                    }
                }

                }

            }

        return 0;

    }
    public boolean oneDiff(String s,String t){
        if(s.length()!=t.length())return false;
        int cnt=0;
        for (int i = 0; i <s.length() ; i++) {
            if(s.charAt(i)!=t.charAt(i)){
                cnt++;
            }
        }
        return cnt==1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Problem3 p=new Problem3();
        while(sc.hasNext()){
            String start=sc.nextLine();
            String end=sc.nextLine();
            String[] list=sc.nextLine().split(" ");
            List<String>wordList=Arrays.asList(list);
            System.out.println(p.ladderLength(start,end,wordList));
        }

    }
}

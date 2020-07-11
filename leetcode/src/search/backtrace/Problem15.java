package search.backtrace;

import java.util.*;

/**
 * @Description: N皇后
 * @Author: wangyou
 * @Date: 2020/7/9
 */
//思路
//    回溯法:
//截至条件,当index来到最后一列,截至
//遍历条件:当目前的i,j不在rows,cols,plus,subt集合里面
//返回结果:二维table表示吧
public class Problem15 {
    private Set<Integer> cols=new HashSet<>();
    private Set<Integer> plus=new HashSet<>();
    private Set<Integer> subt=new HashSet<>();
    int m,n;
    public List<List<String>>queue(char[][]board){
        List<List<String>> res=new ArrayList<>();
        if(board==null||board.length==0||board[0].length==0)return res;
        m=board.length;
        n=board[0].length;

            backtrace(res,board,0);


        return  res;


    }

    private void backtrace(List<List<String>> res, char[][] board, int i) {



        for (int k = 0; k <n ; k++) {
            if(cols.contains(k)||plus.contains(i+k)||subt.contains(k-i))continue;
            board[i][k]='Q';
            cols.add(k);
            plus.add(i+k);
            subt.add(k-i);
            if(i==m-1){
                if(i==m){
                    List<String>list=new ArrayList<>();
                    for (int k1 = 0; k1 <m ; k1++) {
                        list.add(new String(board[k1]));
                    }
                    res.add(list);

                }
            }else{
                backtrace(res,board,i+1);
            }

            board[i][k]='.';
            cols.remove(k);
            plus.remove(i+k);
            subt.remove(k-i);

        }


    }

    public static void main(String[] args) {
        Problem15 p=new Problem15();
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        char[][] board=new char[k][k];
        for (int i = 0; i <k ; i++) {
            Arrays.fill(board[i],'.');
        }
        System.out.println(p.queue(board));

    }
}

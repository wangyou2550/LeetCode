package search.bfs;
/**
 * @Description: 每个位置为0，1；阻塞为1，问从左上角到右下角能不能到达，
 * 到达返回最短路径长度，不能返回-1
 * @Author: wangyou
 * @Date: 2020/7/9
 */

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @Description: 用bfs,对列来存储每一层，多少个入队，表示多长的路径；把访问过的 位置置为0
 * 表示标记访问过
 * @Param:
 * @Return:
 */
//思路：确定bfs,用队列，入队，进入队列不为空的while条件，然后判断size,然后做一些标记
//    二维的可以用数组来代替

public class Problem1 {
    public  class Pair{
        int x;
        int y;

        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
    public   int[][] direction={{1,1},{1,0},{1,-1},{0,1},{0,-1},{-1,-1},{-1,0},{-1,1}};
    public  int shorttestPathBinaryMatrix(int[][]matrix){
        if(matrix==null||matrix.length==0||matrix[0].length==0)return -1;
        int n=matrix.length;
        Queue<Pair>queue=new LinkedList<>();
        if(matrix[0][0]==0){
            queue.add(new Pair(0,0));

        }else{return -1;}
        int res=0;
        while(!queue.isEmpty()){
            res++;
            int size=queue.size();
            for (int i = 0; i <size ; i++) {
                Pair p=queue.poll();
                if(p.x==n-1&&p.y==n-1){
                    if(matrix[p.x][p.y]==0)return res;
                    else return -1;
                }
                for(int[]dir:direction){
                    int x=p.x+dir[0];
                    int y=p.y+dir[1];
                    if(x>=0&&x<n&&y>=0&&y<n&&matrix[x][y]==0){
                        queue.add(new Pair(x,y));
                        matrix[x][y]=1;
                    }
                }
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][]matrix=new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n ; j++) {
                matrix[i][j]=sc.nextInt();

            }

        }
        Problem1 p=new Problem1();
        System.out.println(p.shorttestPathBinaryMatrix(matrix));
    }
}

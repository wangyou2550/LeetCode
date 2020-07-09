package meituan;

import java.util.*;

/**
 * @Description: 拓扑排序，用bfs和dfs.
 * @Param:
 * @Return:
 */
public class Tuopu {
    public int[] findOrder(int numCourse,int[][]prerequirties){
        int []degree=new int[numCourse];
        //创建度的数组
        for(int[]arr:prerequirties){
            degree[arr[0]]++;
        }
        //找到度为0的课，放进队列
        Queue<Integer>queue=new LinkedList<>();
        int[]res=new int[numCourse];
        for (int i = 0; i <numCourse ; i++) {
            if(degree[i]==0)
                queue.add(i);
        }
        if(queue.size()==0)return new int[0];
        //bfs：将度为0的课加入队列，出队时，将课添加到结果数组，然后根据preReuqists调整剩余节点的度；
        int count=0;
      while(!queue.isEmpty()){
          int c=queue.poll();
          res[count++]=c;
          for(int[]arr:prerequirties){
              if(arr[1]==c){
                  degree[arr[0]]--;
                  //添加调整后度为0的课入队
                  if(degree[arr[0]]==0)queue.add(arr[0]);
              }
          }
          //添加调整后度为0的课入队
//          for (int i = 0; i <numCourse ; i++) {
//              if(degree[i]==0)
//                  queue.add(i);
//          }

      }
      return res;
    }

    // 方法 2：邻接矩阵 + DFS   由于用的数组，每次都要遍历，效率比较低
    public int[] findOrder2(int numCourses, int[][] prerequisites) {
        if (numCourses == 0) return new int[0];
        // 建立邻接矩阵
        int[][] graph = new int[numCourses][numCourses];
        for (int[] p : prerequisites) {
            graph[p[1]][p[0]] = 1;
        }
        // 记录访问状态的数组，访问过了标记 -1，正在访问标记 1，还未访问标记 0
        int[] status = new int[numCourses];
        Stack<Integer> stack = new Stack<>();  // 用栈保存访问序列
        for (int i = 0; i < numCourses; i++) {
            if (!dfs(graph, status, i, stack)) return new int[0]; // 只要存在环就返回
        }
        int[] res = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            res[i] = stack.pop();
        }
        return res;
    }

    private boolean dfs(int[][] graph, int[] status, int i, Stack<Integer> stack) {
        if (status[i] == 1) return false; // 当前节点在此次 dfs 中正在访问，说明存在环
        if (status[i] == -1) return true;

        status[i] = 1;
        for (int j = 0; j < graph.length; j++) {
            // dfs 访问当前课程的后续课程，看是否存在环
            if (graph[i][j] == 1 && !dfs(graph, status, j, stack)) return false;
        }
        status[i] = -1;  // 标记为已访问
        stack.push(i);
        return true;
    }


}

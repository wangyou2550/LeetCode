package matrix;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {
    public static int kthSmallList(int[][] matrix, int k) {
        int m = matrix.length, n = matrix[0].length;
        int lo = matrix[0][0], hi = matrix[m - 1][n - 1];
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n && matrix[i][j] <= mid; j++) {
                    cnt++;
                }
            }
            if (cnt < k) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }

    public int KthSmallest1(int[][]matrix,int k){
        int m=matrix.length,n=matrix[0].length;

        PriorityQueue<Integer> pq = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j <n ; j++) {
               pq.offer(matrix[i][j]);
            }

        }
        return pq.poll();
    }
    class Tuple{
        int x,y,val;

        public Tuple(int x, int y, int val) {
            this.x = x;
            this.y = y;
            this.val = val;
        }


    }
    public static void main(String[] args) {
       PriorityQueue<Integer>pq=new PriorityQueue<Integer>(5, new Comparator<Integer>() {
           @Override
           public int compare(Integer o1, Integer o2) {
               return o1-o2;
           }
       });
        for (int i = 0; i <5 ; i++) {
            pq.offer(i);

        }
        for (int i = 5; i < 10; i++) {
            pq.offer(i);
            pq.poll();
        }
        while (!pq.isEmpty()){
            System.out.println(pq.poll());
        }

    }
}

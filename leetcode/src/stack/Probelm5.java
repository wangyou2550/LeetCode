package stack;

import java.util.Stack;

public class Probelm5 {
    public int[]dailyTemperatures(int[]tempratures){
        int n=tempratures.length;
        int []res=new int[n];
        Stack<Integer> index = new Stack<Integer>();
        index.push(0);
        for (int i = 1; i < n; i++) {
           if(tempratures[i]<=tempratures[index.peek()]){
               index.push(i);
           }else{
               while(!index.isEmpty()&&tempratures[index.peek()]<tempratures[i]){
                   int cur=index.pop();
                   res[cur]=i-cur;
               }
               index.push(i);


           }

        }
        return res;
    }

    public static void main(String[] args) {
        Probelm5 p=new Probelm5();
        for(int num:p.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})){
            System.out.print(num+",");
        }
    }
}

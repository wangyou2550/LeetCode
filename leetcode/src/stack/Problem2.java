package stack;

import sun.font.FontRunIterator;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Description: 用队列实现栈19961267385
 */
public class Problem2<T> {
    private Queue<T> queue=new LinkedList<>();
    public void push(T x){
        queue.add(x);
        int cnt=queue.size();
        while(cnt-->1){
            queue.add(queue.poll());
        }

    }
    public T pop(){
        return queue.remove();
    }
    public T top(){
        return queue.peek();
    }






}

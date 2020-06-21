package stack;

import java.util.Stack;

/**
 * @Description: 实现最小站
 */
public class Problem3 {
    private Stack<Integer>dataStack;
    private Stack<Integer>minStack;
    private int min;

    public Problem3() {
        dataStack=new Stack<>();
        minStack=new Stack<>();
        min=Integer.MAX_VALUE;
    }
    public void push(int x){
        dataStack.push(x);
        min=Math.min(x,min);
        minStack.push(min);

    }
    public void pop(){
        dataStack.pop();
        minStack.pop();
        min=minStack.isEmpty()?Integer.MAX_VALUE:minStack.peek();
    }
    public int top(){
        return dataStack.peek();
    }
    public int getMin(){
        return minStack.peek();
    }
}

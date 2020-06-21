package stack;

import java.util.Stack;

/**
 * @Description: 用栈实现队列
 */
public class MyQueue<T> {
    private Stack<T> in=new Stack<>();
    private Stack<T> out=new Stack<>();
    public void push(T t) {
        in.push(t);

    }

    public T pop() {
        if(!out.isEmpty()){
           return  out.pop();
        }else{
            while(!in.isEmpty()){
                out.push(in.pop());
            }
            return out.pop();
        }
    }


    public boolean empty(){
        return in.isEmpty()&&out.isEmpty();
    }
}


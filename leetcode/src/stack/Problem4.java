package stack;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Stack;

public class Problem4 {
    public boolean isValid(String s){
        Stack<Character>stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('||c=='['||c=='{'){
                stack.push(c);
            }else{
                if(stack.isEmpty())return false;
                boolean b1=stack.peek()=='('&&c==')'?true:false;
                boolean b2=stack.peek()=='['&&c==']'?true:false;
                boolean b3=stack.peek()=='{'&&c=='}'?true:false;

                if(!(b1||b2||b3))return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Problem4 p=new Problem4();
        System.out.println(p.isValid("()[{)}]()"));
    }
}

package meituan;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Problem1 {
    private Set<String> sets1=new HashSet<>();
    private Set<String> sets2=new HashSet<>();
    void computer(String[]input){
        boolean res;

        sets1.add(new String("and"));
        sets1.add(new String("or"));
        sets2.add(new String("false"));
        sets2.add(new String("true"));
//        sets1.add("or");
//        sets2.add("true");
//        sets2.add("false");
        Stack<String> stack=new Stack();
        for(String item:input){
            if(!sets1.contains(item)&&!sets2.contains(item)){
                System.out.println("error");
                return;
            }
            if(stack.isEmpty()&&(sets1.contains(item))){
                System.out.println("error");
                return;
            }
            if(!stack.isEmpty()){
                if((sets1.contains(stack.peek())&&sets1.contains(item))||(sets2.contains(stack.peek())&&sets2.contains(item))){
                    System.out.println("error");
                    return;
                }
                if(stack.peek().equals("and")){
                    stack.pop();
                    boolean b1=stack.pop().equals("true")?true:false;
                    boolean b2=item.equals("true")?true:false;
                    stack.push(b1&&b2?"true":"false");
                    continue;
                }
            }
            stack.push(item);



        }
        if(sets1.contains(stack.peek())){
            System.out.println("error");
            return;
        }
        while(!stack.isEmpty()){
            if(stack.pop().equals("true")){
                System.out.println("true");
                return;
            }

        }
        System.out.println("false");
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] input=sc.nextLine().split(" ");
        Problem1 p=new Problem1();
        p.computer(input);

    }
}

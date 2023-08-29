package Stacks;

import java.util.Stack;

public class JCFStacks {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2); //push
        s.push(3);
        System.out.println(s.search(1));//search
        System.out.println(s.isEmpty());//isempty


        while (!s.isEmpty()) {
            System.out.println(s.peek()); //peek
            s.pop(); //pop
            
        }
    }

}

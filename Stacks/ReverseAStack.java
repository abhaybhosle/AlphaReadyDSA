package Stacks;

import java.util.Stack;

public class ReverseAStack {

    public static void pushAtBottom(Stack<Integer> ss, int data) {
        if (ss.isEmpty()) {
            ss.push(data);
            return;
        }
        int top = ss.pop();
        pushAtBottom(ss, data);
        ss.push(top);
    }

    public static void reverseStk(Stack<Integer> ss) {
        if (ss.isEmpty()) {
            return;
        }
        int top = ss.pop();
        reverseStk(ss);
        pushAtBottom(ss, top);
    }

    public static void PrintStk(Stack<Integer> ss) {
        while (! ss.isEmpty()) {
            System.out.println(ss.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();
        ss.push(1);
        ss.push(2);
        ss.push(3);
        reverseStk(ss);
        PrintStk(ss);

    }

}

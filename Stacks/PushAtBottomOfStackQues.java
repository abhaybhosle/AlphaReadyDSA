//Push at the bottom of the Stack -- (Amazon)
package Stacks;

import java.util.Stack;

public class PushAtBottomOfStackQues {

    public static void pushAtBottom(Stack<Integer> ss, int data) {
        if (ss.isEmpty()) {
            ss.push(data);
            return;
        }
        int top = ss.pop();
        pushAtBottom(ss, data);
        ss.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> ss = new Stack<>();
        ss.push(1);
        ss.push(2);
        ss.push(3);

        pushAtBottom(ss, 4);
        while (!ss.isEmpty()) {
            System.out.println(ss.pop());

        }

    }

}


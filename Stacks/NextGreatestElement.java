package Stacks;

import java.util.Stack;

public class NextGreatestElement {
    public static void main(String[] args) {
        int arr[] = { 6, 8, 0, 1, 3 };
        Stack<Integer> s = new Stack<>();
        int nxtgreatest[] = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; i--) {
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nxtgreatest[i] = -1;
            } else {
                nxtgreatest[i] = arr[s.peek()];
            }
            s.push(i);
        }

        for (int i = 0; i < nxtgreatest.length; i++) {
            System.out.print(nxtgreatest[i] + " ");

        }
        System.out.println();
    }

}
// next Greatest Right --> above code
// next Greatest Left --> change line number 11 to for(int i =0;i<arr.length-1;i++);
// next Smaller Right --> change line number 12 while(!s.isEmpty() && arr[s.peek()] >= arr[i]);
// next Smaller Left --> change for loop (from start to end) and
// while(!s.isEmpty() && arr[s.peek()] >= arr[i]);

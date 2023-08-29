package Stacks;

public class StackArray {
    int arr[];
    int top;
    int size;

    StackArray(int size) {
        this.size = size;
        top = -1;
        this.arr = new int[size];

    }

    public boolean isFull() {
        return (size - 1 == top);
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int peek() {
        return arr[top];
    }

    public void push(int data) {
        if (!isFull()) {
            arr[++top] = data;
            System.out.println("Element pushed into stack : " + data);
        } else {
            System.out.println("Stack Overflow");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int val = arr[top];
            top--;
            System.out.println("Popped element is " + val);
            return val;
        } else {
            System.out.println("Stack Underflow ");
            return -1;
        }
    }

    public static void main(String[] args) {
        StackArray s = new StackArray(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.pop();

        System.out.println("Peek element is : " + s.peek());

    }

}

package Stacks;

public class basic {
    public static void main(String[] args) {
        MyStack s = new MyStack(5);
        s.push(5);
        s.push(10);
        s.push(20);
        System.out.println("The stack is: ");
        s.print();
        System.out.println();
        System.out.println("Element deleted :");
        System.out.println(s.pop());
//        System.out.println(s.size());
//        System.out.println(s.peek());
//        System.out.println(s.isEmpty());


    }

    static class MyStack {
        int[] arr;
        int cap;
        int top;

        MyStack(int c) {
            top = -1;
            cap = c;
            arr = new int[cap];

        }

        void push(int x) {
            if (top == cap - 1) {
                System.out.println("Stack is full");
                return;
            }
            top++;
            arr[top] = x;
        }

        void print() {
            for (int i = top; i > -1; i--) {
                System.out.print(arr[i] + " ");
            }
        }

        int pop() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
            int res = arr[top];
            top--;
            return res;
        }

        int peek() {
            if (top == -1) {
                System.out.println("Stack is Empty");
                return Integer.MIN_VALUE;
            }
            return arr[top];
        }

        int size() {
            return (top + 1);
        }

        boolean isEmpty() {
            return top == -1;
        }

    }


}

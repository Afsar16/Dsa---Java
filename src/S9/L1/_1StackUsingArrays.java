package S9.L1;

public class _1StackUsingArrays {
    private int maxSize;
    private int [] stackArray;
    private int top;

    public _1StackUsingArrays (int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push (int value) {
        if(isFull()) {
            System.out.println("Stack is full Cannot push");
        }
        else {
            stackArray[++top] = value;
            System.out.println(value);
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is Empty - Cannot POP");
            return -1;
        }
        return stackArray[top--];
    }

    public int peek() {
        if(isEmpty()) {
            System.out.println("Stack is Empty - Cannot Peek");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        _1StackUsingArrays stack = new _1StackUsingArrays(5);
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.push(5);
//        stack.push(6);
        stack.push(6);
//        stack.pop();
//        stack.pop();
//        stack.pop();
        int a = stack.size();
//        int a = stack.peek();
//
        System.out.println(a);
    }
}

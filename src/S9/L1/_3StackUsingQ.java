package S9.L1;

public class _3StackUsingQ {
    /* / / using 1 queue
class MyStack {
    private Queue<Integer> queue;
    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        for(int i=0; i<queue.size()-1; i++) { // because one element should be there itself
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.remove();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}


 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();


/ / using 2 queue
    class MyStack {
        private Queue<Integer> queue1;
        private Queue<Integer> queue2;

        public MyStack() {
            queue1 = new LinkedList<>();
            queue2 = new LinkedList<>();
        }

        public void push(int x) {
            // Push the new element into queue2
            queue2.add(x);
            // Transfer all elements from queue1 to queue2
            while (!queue1.isEmpty()) {
                queue2.add(queue1.remove());
            }
            // Swap the names of queue1 and queue2
            Queue<Integer> temp = queue1;
            queue1 = queue2;
            queue2 = temp;
        }

        public int pop() {
            // The top element is always at the front of queue1
            return queue1.remove();
        }

        public int top() {
            // Peek the front element of queue1, which is the top of the stack
            return queue1.peek();
        }

        public boolean empty() {
            // The stack is empty if queue1 is empty
            return queue1.isEmpty();
        }
    }


 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();

*/
}

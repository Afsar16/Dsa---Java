package S9.L1;


import java.util.LinkedList;
import java.util.Queue;

public class _3Runnable {
        private Queue<Integer> queue;

        public _3Runnable() {
            queue = new LinkedList<>();
        }

        public void push(int x) {
            queue.add(x);
            for(int i = 0; i < queue.size() - 1; i++) {
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

        public static void main(String[] args) {
            _3Runnable stack = new _3Runnable();

            // Testing push operation
            stack.push(1);
            System.out.println("Top after pushing 1: " + stack.top()); // Output: 1

            stack.push(2);
            System.out.println("Top after pushing 2: " + stack.top()); // Output: 2

            stack.push(3);
            System.out.println("Top after pushing 3: " + stack.top()); // Output: 3

            // Testing pop operation
            System.out.println("Popped: " + stack.pop()); // Output: 3
            System.out.println("Top after popping: " + stack.top()); // Output: 2

            // Testing empty operation
            System.out.println("Is stack empty? " + stack.empty()); // Output: false

            stack.pop();
            stack.pop();

            System.out.println("Is stack empty after popping all elements? " + stack.empty()); // Output: true
        }
    }


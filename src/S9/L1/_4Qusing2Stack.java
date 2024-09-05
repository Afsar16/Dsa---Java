package S9.L1;
import java.util.*;
public class _4Qusing2Stack {

        private Stack<Integer> input;
        private Stack<Integer> output;
        public _4Qusing2Stack() {
            input = new Stack<>();
            output = new Stack<>();

        }

        public void push(int x) {
            input.push(x);
        }

        public int pop() {
            peek();
            return output.pop();
        }

        public int peek() {
            if(output.empty()) {
                while(!input.empty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty() {
            return input.empty() && output.empty();
        }

    public static void main(String[] args) {
        _4Qusing2Stack q = new _4Qusing2Stack();
        q.push(1);
        q.push(2);
        q.push(2);
        System.out.println(q.peek());
        q.push(3);
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.pop());
        System.out.println(q.empty());
        q.push(6);
        System.out.println(q.empty());

    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
}

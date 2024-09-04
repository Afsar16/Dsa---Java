package S9.L1;

public class _2QueueUsingArrays {
        private int maxSize; // maximum size of the queue
        private int[] queueArray; // array to hold queue elements
        private int front; // front of the queue
        private int rear; // rear of the queue
        private int nItems; // number of elements in the queue

        // Constructor to initialize the queue
        public _2QueueUsingArrays(int size) {
            maxSize = size;
            queueArray = new int[maxSize];
            front = 0; // index of the front element
            rear = -1; // no item in the queue yet
            nItems = 0; // initially, there are no items in the queue
        }

        // Insert method to add an element to the rear of the queue
        public void insert(int value) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot insert " + value);
            } else {
//                if (rear == maxSize - 1) { // wrap-around if needed
//                    rear = -1;
//                }
                queueArray[++rear] = value;
                nItems++;
                System.out.println("Inserted " + value + " into the queue.");
            }
        }

        // Remove method to remove and return the front element from the queue
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot remove.");
                return -1; // return -1 to indicate queue is empty
            } else {
                int temp = queueArray[front++];
//                if (front == maxSize) { // wrap-around if needed
//                    front = 0;
//                }
                nItems--;
                return temp;
            }
        }

        // Peek method to return the front element without removing it
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Nothing to peek.");
                return -1; // return -1 to indicate queue is empty
            } else {
                return queueArray[front];
            }
        }

        // Method to check if the queue is empty
        public boolean isEmpty() {
            return (nItems == 0);
        }

        // Method to check if the queue is full
        public boolean isFull() {
            return (nItems == maxSize);
        }

        // Method to return the number of elements in the queue
        public int size() {
            return nItems;
        }

        public static void main(String[] args) {
            _2QueueUsingArrays queue = new _2QueueUsingArrays(5);

            queue.insert(10);
            queue.insert(20);
            queue.insert(30);
            queue.insert(40);
            queue.insert(50);
            queue.insert(60); // This insert will fail as the queue is full

            System.out.println("Front element is: " + queue.peek());
            System.out.println("Queue size is: " + queue.size());

            while (!queue.isEmpty()) {
                int value = queue.remove();
                System.out.println("Removed " + value);
            }

            queue.remove(); // This remove will fail as the queue is empty
        }
    }



package Queue;
public class customQueueImplementation {
    static class Queue {
        static int[] arr;
        static int front = -1;
        static int rear = -1;
        static int n;

        Queue(int size) {
            n = size;
            arr = new int[n];
        }

        public boolean isEmpty() {
            return rear == -1 || rear >= n;
        }

        public void enque(int data) {
            if (rear == n - 1) {
                System.out.println("Queue is full!");
                return;
            } else if (front == -1 && rear == -1) {
                front++;
            }
            rear++;
            arr[rear] = data;
        }

        public void deque() throws Exception{
            if (isEmpty()) {
                throw new Exception("Queue is empty!!");
            }

            front++;
        }

        public int peek() throws Exception{
            if (isEmpty()) {
               throw new Exception("Queue is Empty!!");
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.enque(1);
        q1.enque(2);
        q1.enque(3);
        q1.enque(4);
        q1.enque(5);

        try {
            q1.deque();
            System.out.println(q1.peek());
            q1.deque();
            System.out.println(q1.peek());
            q1.deque();
            System.out.println(q1.peek());
        }catch(Exception e){
            System.out.println(e);
        }

    }
}
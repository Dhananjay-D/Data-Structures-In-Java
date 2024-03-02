package Queue;

public class CircularQueue {
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
            return rear == -1;
        }

        public void enque(int data) {
            if(front == -1 && rear == -1) {
                front++;
                rear++;
                arr[rear] = data;
            }
            else{
                rear=(rear+1)%n;
                arr[rear]=data;
            }
        }

        public void deque() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }
            else if(front==rear){
                front=-1;
                rear=-1;
            }
            else{
                front=(front+1)%n;
            }
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return -1;
            }
            return arr[front];
        }

        public void display(){
            if (isEmpty()) {
                System.out.println("Queue is empty!");
                return;
            }
            System.out.println("Queue Elements are: ");
            for(int i:arr){
                System.out.print(i+" ");
            }
        }

    }

    public static void main(String[] args) {
        Queue q1 = new Queue(5);
        q1.enque(1);
        q1.enque(2);
        q1.enque(3);
        q1.enque(4);
        q1.enque(5);

        q1.deque();
        q1.enque(6);
        System.out.println(q1.peek());
        q1.deque();
        q1.enque(7);
        System.out.println(q1.peek());
        q1.display();
    }
}

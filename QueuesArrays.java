public class QueuesArrays {
    private int front;
    private int rear;
    private final int[] queue;
    private int size;
    private final int capacity;

    public QueuesArrays(int capacity) {
        this.capacity = capacity;
        this.front = this.size = 0;
        this.rear = capacity - 1;
        this.queue = new int[this.capacity];
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        this.rear = (this.rear + 1) % this.capacity;
        this.queue[this.rear] = item;
        this.size = this.size + 1;
        System.out.println(item + " enqueued to queue");
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int item = this.queue[this.front];
        this.front = (this.front + 1) % this.capacity;
        this.size = this.size - 1;
        return item;
    }

    public static void main(String[] args) {
        QueuesArrays queue = new QueuesArrays(10);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println(queue.dequeue() + " dequeued from queue");
        System.out.println("Front item is " + queue.queue[queue.front]);
        System.out.println("Rear item is " + queue.queue[queue.rear]);
    }
}

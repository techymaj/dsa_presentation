import java.util.LinkedList;
import java.util.Queue;

// Queues are an abstract data type and just like stacks, they dictate how data is added and removed.
// And just like stacks, they are a first in, first out data structure.
// The difference is that queues are FIFO, while stacks are LIFO.
// Queues are also known as FIFO queues, first in first out queues, or linear queues.
// Queues are used in a lot of different applications, such as printers, operating systems, and web servers.
// Queues are also used in breadth first search algorithms.
// Just like stacks, we use other data structures to implement queues.
// Just like stacks, there are 3 main operations that we can perform on queues. ADD, REMOVE, and PEEK.
// We can use Arrays and LinkedLists to implement queues.
public class QueuesLinkedLists {
    public static void main(String[] args) {
        // We can use the LinkedList class to implement a queue.
        // We can use the add() method to add elements to the queue.
        // We can use the remove() method to remove elements from the queue.
        // We can use the peek() method to get the first element in the queue.
        // We can use the size() method to get the size of the queue.
        // We can use the isEmpty() method to check if the queue is empty.
        // We can use the clear() method to clear the queue.
        Queue<Integer> queue = new LinkedList<>();
        // LinkedList should be used where modifications to a collection are frequent like addition/deletion operations.
        // A linked list is a linear data structure that stores a collection of data elements dynamically.
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.clear();
        System.out.println(queue);

    }
}

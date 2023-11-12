package module_9.queue;

public class MyQueueTest {
    public static void main(String[] args) {
        MyQueue<String> myQueue = new MyQueue<>(5);

        myQueue.add("FirstWord");
        myQueue.add("SecondWord");
        myQueue.add("ThirdWord");
        myQueue.add("777");
        System.out.println("Queue size: " + myQueue.size());
        System.out.println("Peek: " + myQueue.peek());
        System.out.println("Removed: " + myQueue.poll());
        System.out.println("Removed: " + myQueue.poll());
        System.out.println("Queue size after removal: " + myQueue.size());
        myQueue.clear();
        System.out.println("Queue size after clearing: " + myQueue.size());
    }
}


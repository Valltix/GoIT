package module_9.queue;

public class MyQueue<T> {
    private Object[] elements;
    private int size;
    private int capacity;
    private int front;
    private int rear;

    public MyQueue(int capacity) {
        this.capacity = capacity;
        elements = new Object[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public void add(T value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % capacity;
        elements[rear] = value;
        size++;
    }

    public void clear() {
        elements = new Object[capacity];
        size = 0;
        front = 0;
        rear = -1;
    }

    public int size() {
        return size;
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return (T) elements[front];
    }

    public T poll() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        T value = (T) elements[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }
}


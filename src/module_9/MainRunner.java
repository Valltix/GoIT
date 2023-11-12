package module_9;

import module_9.myArrayList.MyArrayListTest;
import module_9.myHashMap.MyHashMapTest;
import module_9.myLinkedList.MyLinkedListTest;
import module_9.myStack.MyStackTest;
import module_9.queue.MyQueueTest;

public class MainRunner {
    public static void main(String[] args) {
        System.out.println("myArrayListTest: ");
        MyArrayListTest.main(args);
        System.out.println("\n\nmyHashMapTest: ");
        MyHashMapTest.main(args);
        System.out.println("\n\nmyLinkedListTest: ");
        MyLinkedListTest.main(args);
        System.out.println("\n\nmyStackTest: ");
        MyStackTest.main(args);
        System.out.println("\n\nmyQueueTest: ");
        MyQueueTest.main(args);
    }
}

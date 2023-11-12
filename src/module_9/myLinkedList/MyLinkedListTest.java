package module_9.myLinkedList;

public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();

        myLinkedList.add("FirstWord");
        myLinkedList.add("SecondWord");
        myLinkedList.add("ThirdWord");
        myLinkedList.add("007");
        myLinkedList.get(2);
        System.out.println("Size: " + myLinkedList.size());
        myLinkedList.remove(1);
        System.out.println("Size after removal: " + myLinkedList.size());
        myLinkedList.clear();
        System.out.println("Size after clearing: " + myLinkedList.size());
    }
}

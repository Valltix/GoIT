package module_9.myHashMap;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyHashMap<String, Integer> myHashMap = new MyHashMap<>();

        myHashMap.put("one", 1);
        myHashMap.put("two", 2);
        myHashMap.put("three", 3);
        System.out.println("Value for key 'one': " + myHashMap.get("one"));
        System.out.println("Value for key 'two': " + myHashMap.get("two"));
        myHashMap.remove("two");
        System.out.println("Size of MyHashMap: " + myHashMap.size());
        myHashMap.clear();
        System.out.println("Size of MyHashMap after clear: " + myHashMap.size());
    }
}


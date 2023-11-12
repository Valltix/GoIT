package module_9.myHashMap;

public class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private Node<K, V>[] table;
    private int size;

    public MyHashMap() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public void put(K key, V value) {
        int index = key.hashCode() % table.length;
        Node<K, V> newNode = new Node<>(key, value);
        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node<K, V> currentNode = table[index];
            while (currentNode.getNext() != null) {
                if (currentNode.getKey().equals(key)) {
                    currentNode.setValue(value);
                    return;
                }
                currentNode = currentNode.getNext();
            }
            if (currentNode.getKey().equals(key)) {
                currentNode.setValue(value);
            } else {
                currentNode.setNext(newNode);
            }
        }
        size++;
    }

    public void remove(K key) {
        int index = key.hashCode() % table.length;
        Node<K, V> currentNode = table[index];
        Node<K, V> previousNode = null;
        while (currentNode != null) {
            if (currentNode.getKey().equals(key)) {
                if (previousNode == null) {
                    table[index] = currentNode.getNext();
                } else {
                    previousNode.setNext(currentNode.getNext());
                }
                size--;
                return;
            }
            previousNode = currentNode;
            currentNode = currentNode.getNext();
        }
    }

    public void clear() {
        table = new Node[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public V get(K key) {
        int index = key.hashCode() % table.length;
        Node<K, V> currentNode = table[index];
        while (currentNode != null) {
            if (currentNode.getKey().equals(key)) {
                return currentNode.getValue();
            }
            currentNode = currentNode.getNext();
        }
        return null;
    }


}


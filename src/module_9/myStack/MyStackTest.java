package module_9.myStack;

public class MyStackTest {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();

        myStack.push("FirstWord");
        myStack.push("SecondWord");
        myStack.push("ThirdWord");
        myStack.push("777");
        System.out.println("Stack size: " + myStack.size());
        System.out.println("Peek: " + myStack.peek());
        System.out.println("Popped: " + myStack.pop());
        System.out.println("Popped: " + myStack.pop());
        System.out.println("Stack size after popped: " + myStack.size());
        myStack.remove(0);
        System.out.println("Stack size after removed 0 index: " + myStack.size());
        myStack.clear();
        System.out.println("Stack size after clearing: " + myStack.size());
    }
}


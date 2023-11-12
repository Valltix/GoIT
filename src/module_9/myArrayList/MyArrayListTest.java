package module_9.myArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
        MyArrayList<Object> myArrayList = new MyArrayList<>();

        myArrayList.add("SecondWord");
        myArrayList.add(444);
        myArrayList.add("Mars");
        System.out.println(".toString() = " + myArrayList.toString());
        myArrayList.size();
        myArrayList.add(0,"FirstWord");
        System.out.println(".toString() = " + myArrayList.toString());
        myArrayList.size();
        myArrayList.remove(2);
        myArrayList.remove(2);
        myArrayList.get(0);
        myArrayList.get(1);
        myArrayList.size();
        myArrayList.clear();
        myArrayList.size();

    }
}

package module_6.task_14;

class RectangleTest {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(10, 5);
        Rectangle r2 = new Rectangle(3, 7);
        Rectangle r3 = new Rectangle(10, 15);

        //false
        System.out.println(r1.canPlaceInto(r2));

        //true
        System.out.println(r1.canPlaceInto(r3));

        //true
        System.out.println(r2.canPlaceInto(r3));

        //false
        System.out.println(r3.canPlaceInto(r2));
    }
}

class Rectangle {
    int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean canPlaceInto(Rectangle anotherRect) {
        return a <= anotherRect.getA() && b <= anotherRect.getB() ||a <= anotherRect.getB() && b <= anotherRect.getA() ;
        //   return Math.sqrt(a*a + b * b)<=Math.sqrt(anotherRect.getA()*anotherRect.getA() + anotherRect.getB() * anotherRect.getB());
    }
}
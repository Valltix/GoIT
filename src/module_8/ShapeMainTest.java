package module_8;

class ShapeMainTest {
    public static void main(String[] args) {

        Circle circle = new Circle();
        circle.consolePrint();
        circle.saveToFile();

        Quad quad = new Quad();
        quad.consolePrint();
        quad.saveToFile();

        Diamond diamond = new Diamond();
        diamond.consolePrint();
        diamond.saveToFile();


    }
}

package module_8;


abstract class Shape {
    String name;
    public String getName() {
        return name;
    }

}


class Circle extends Shape implements ShapeActions {

    public Circle() {
        this.name = "Diamond";
    }

    @Override
    public void consolePrint() {
        DrawShape.print(this);
    }

    @Override
    public void saveToFile() {
        SaveToFile.saveAsJSON(this);
    }
}

class Quad extends Shape implements ShapeActions {
    public Quad() {
        this.name = "Diamond";
    }

    @Override
    public void consolePrint() {
        DrawShape.print(this);
    }

    @Override
    public void saveToFile() {
        SaveToFile.saveAsJSON(this);
    }
}

class Oval extends Shape implements ShapeActions {
    public Oval() {
        this.name = "Diamond";
    }

    @Override
    public void consolePrint() {
        DrawShape.print(this);
    }

    @Override
    public void saveToFile() {
        SaveToFile.saveAsJSON(this);
    }
}

class Triangle extends Shape implements ShapeActions {
    public Triangle() {
        this.name = "Diamond";
    }

    @Override
    public void consolePrint() {
        DrawShape.print(this);
    }

    @Override
    public void saveToFile() {
        SaveToFile.saveAsJSON(this);
    }
}

class Diamond extends Shape implements ShapeActions {
    public Diamond() {
        this.name = "Diamond";
    }

    @Override
    public void consolePrint() {
       DrawShape.print(this);
    }

    @Override
    public void saveToFile() {
        SaveToFile.saveAsJSON(this);
    }
}

class DrawShape {
    public static void print(Shape shape){
        System.out.println("Shape name: " + shape.getName());
    }
}

class SaveToFile {
    public static void saveAsJSON (Shape shape){
        System.out.println("File saved with name: " + shape.getName() + ".json");
    }
}



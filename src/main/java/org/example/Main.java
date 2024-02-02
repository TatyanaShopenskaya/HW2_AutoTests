package org.example;

public class Main {
    public static void main(String[] args) {
        Shape circle1 = new Circle();
        Shape square1 = new Square();

        Shape triangle1 = new Triangle();
        Shape circle2 = new Circle();

        Composite compositeMain = new Composite();
        Composite composite1 = new Composite();
        Composite composite2 = new Composite();

        composite1.addShapes(circle1);
        composite1.addShapes(square1);

        composite2.addShapes(triangle1);
        composite2.addShapes(circle2);

        compositeMain.addShapes(composite1);
        compositeMain.addShapes(composite2);

        compositeMain.draw();
    }
}

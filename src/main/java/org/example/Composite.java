package org.example;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Shape {
    public ArrayList<Shape> shapesList = new ArrayList<>();

    public void addShapes(Shape shape) {
        shapesList.add(shape);
    }

    public void removeShapes(Shape shape) {
        shapesList.remove(shape);
    }

    @Override
    public String draw() {
        for (Shape shape : shapesList) {
            shape.draw();
        }
        return "Круг";
    }
}

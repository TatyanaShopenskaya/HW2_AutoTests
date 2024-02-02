package org.example;

public class Circle implements Shape {
    @Override
    public String draw() {
        System.out.println("Круг");
        return "Круг";
    }
}

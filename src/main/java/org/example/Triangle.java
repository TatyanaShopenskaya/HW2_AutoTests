package org.example;

public class Triangle implements Shape{
    @Override
    public String draw() {
        System.out.println("Треугольник");
        return "Треугольник";
    }
}

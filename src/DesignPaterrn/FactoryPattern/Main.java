package DesignPaterrn.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape circle = sf.createShape("circle");
        circle.draw();
    }
}

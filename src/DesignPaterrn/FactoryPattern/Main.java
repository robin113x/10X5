package DesignPaterrn.FactoryPattern;

public class Main {
    public static void main(String[] args) {
        ShapeFactory sf = new ShapeFactory();
        Shape circle = sf.createShape("circle");
        circle.draw();

        Shape rect = sf.createShape("rectangle");
        rect.draw();

        Shape tri = sf.createShape("triangle");
        tri.draw();
    }
}

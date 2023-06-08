package DesignPaterrn.FactoryPattern;

public class ShapeFactory {
    public Shape createShape(String type){
        if (type.equalsIgnoreCase("circle")) return new Circle();
        else if (type.equalsIgnoreCase("rectangle")) return new Rectangle();
        else if(type.equalsIgnoreCase("triangle")) return new Triangle();
        throw new IllegalArgumentException("Invalid");
    }
}

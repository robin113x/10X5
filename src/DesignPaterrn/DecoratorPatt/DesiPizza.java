package DesignPaterrn.DecoratorPatt;

public class DesiPizza extends BasePizza{
    @Override
    public String getDis() {
        return "Desi Pizza";
    }

    @Override
    public double getCost() {
        return 300.0;
    }
}

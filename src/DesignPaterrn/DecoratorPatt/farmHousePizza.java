package DesignPaterrn.DecoratorPatt;

public class farmHousePizza extends BasePizza{
    @Override
    public String getDis() {
        return "FarmHouse Pizza";
    }

    @Override
    public double getCost() {
        return 220.0;
    }
}

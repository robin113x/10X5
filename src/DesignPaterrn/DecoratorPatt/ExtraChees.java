package DesignPaterrn.DecoratorPatt;

public class ExtraChees extends PizzaDecorator{
    BasePizza bpizza;
     ExtraChees(BasePizza bpizza){
        this.bpizza=bpizza;
    }

    @Override
    public double getCost() {
        return bpizza.getCost()+100;
    }

    @Override
    public String getDis() {
        return bpizza.getDis()+" ExtraChees";
    }
}

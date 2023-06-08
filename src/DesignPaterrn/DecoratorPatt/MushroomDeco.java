package DesignPaterrn.DecoratorPatt;

public class MushroomDeco extends PizzaDecorator{
    BasePizza bpizza;
     MushroomDeco(BasePizza bpizza){
        this.bpizza=bpizza;
    }
    @Override
    public double getCost(){
        return bpizza.getCost()+300.0;
    }

    @Override
    public String getDis() {
        return bpizza.getDis()+" Mushroom ";
    }
}

package DesignPaterrn.DecoratorPatt;

public class Main {
    public static void main(String[] args) {
        BasePizza bippz = new DesiPizza();
        bippz=new MushroomDeco(bippz);
        bippz = new ExtraChees(bippz);

        System.out.println(bippz);
        System.out.println(bippz.getDis());
        System.out.println("Rs." +bippz.getCost());

        System.out.println("***************");
        BasePizza bpizza = new farmHousePizza();
        bpizza = new MushroomDeco(new ExtraChees(bpizza));
        System.out.println(bpizza);
        System.out.println(bpizza.getDis());
        System.out.println(bpizza.getCost());

    }
}

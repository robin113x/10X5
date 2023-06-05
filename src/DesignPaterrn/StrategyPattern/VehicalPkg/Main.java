package DesignPaterrn.StrategyPattern.VehicalPkg;


public class Main {
    public static void main(String[] args) {

        Vehical obj = new GoodsVehical();
        obj.drive();

        Vehical off = new offRoadVehical();
        off.drive();

       Vehical spo = new SportsVehical();
        spo.drive();

        Vehical a = new ABC();
        a.drive();
    }
}

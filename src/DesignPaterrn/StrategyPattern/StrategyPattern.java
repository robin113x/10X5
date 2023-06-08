package DesignPaterrn.StrategyPattern;

interface DriveStrategy {
    void drive();
}
 class NormalDrive implements DriveStrategy {
    @Override
    public void drive(){
        System.out.println("Normal Drive Class");
    }
}
class OffRoadDrive implements DriveStrategy {
    @Override
    public void drive(){
        System.out.println("Off Road Drive Class");
    }
}
 class SportsDrive implements DriveStrategy{
    public void drive(){
        System.out.println("Sports Drive Class");
    }
}
class XyzDrive implements DriveStrategy{
    public void drive(){
        System.out.println("XYZ Drive Class");
    }
}
class Vehical  {

     DriveStrategy driveObj;
    Vehical(DriveStrategy driveObj){
        this.driveObj = driveObj;
    }
    public void drive(){
        this.driveObj.drive();
    }
}

class GoodsVehical extends Vehical {
    GoodsVehical() {
        super(new NormalDrive());
    }
}
class offRoadVehical extends Vehical {
    offRoadVehical(){
        super( new OffRoadDrive());

    }
}
class SportsVehical extends Vehical{
    SportsVehical(){
        super(new SportsDrive());
    }
}


class ABC extends Vehical {
    ABC(){
       super(new XyzDrive());
    }
}


public class StrategyPattern {
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

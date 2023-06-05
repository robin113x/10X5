package DesignPaterrn.StrategyPattern.VehicalPkg;
import DesignPaterrn.StrategyPattern.StrategyDesign.DriveStrategy;
public class Vehical  {

     DriveStrategy driveObj;
    Vehical(DriveStrategy driveObj){
        this.driveObj = driveObj;
    }
    public void drive(){
        this.driveObj.drive();
    }
}

package DesignPaterrn.StrategyPattern.StrategyDesign;

public class OffRoadDrive implements DriveStrategy{
    @Override
    public void drive(){
        System.out.println("Off Road Drive Class");
    }
}

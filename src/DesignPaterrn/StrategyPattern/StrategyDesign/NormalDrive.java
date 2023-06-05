package DesignPaterrn.StrategyPattern.StrategyDesign;

public class NormalDrive implements DriveStrategy {
    @Override
    public void drive(){
        System.out.println("Normal Drive Class");
    }
}

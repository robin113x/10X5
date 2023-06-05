package DesignPaterrn.StrategyPattern.VehicalPkg;

import DesignPaterrn.StrategyPattern.StrategyDesign.SportsDrive;

public class SportsVehical extends Vehical{
    SportsVehical(){
        super(new SportsDrive());
    }
}

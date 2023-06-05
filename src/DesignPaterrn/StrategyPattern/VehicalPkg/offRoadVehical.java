package DesignPaterrn.StrategyPattern.VehicalPkg;

import DesignPaterrn.StrategyPattern.StrategyDesign.OffRoadDrive;

public class offRoadVehical extends Vehical {
    offRoadVehical(){
        super( new OffRoadDrive());

    }
}

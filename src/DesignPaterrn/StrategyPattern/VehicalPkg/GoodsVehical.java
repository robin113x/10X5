package DesignPaterrn.StrategyPattern.VehicalPkg;

import DesignPaterrn.StrategyPattern.StrategyDesign.NormalDrive;

public class GoodsVehical extends Vehical {

    GoodsVehical() {

        super(new NormalDrive());
    }
}

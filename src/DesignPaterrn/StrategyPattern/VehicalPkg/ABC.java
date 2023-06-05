package DesignPaterrn.StrategyPattern.VehicalPkg;

import DesignPaterrn.StrategyPattern.StrategyDesign.XyzDrive;

public class ABC extends Vehical {
    ABC(){
       super(new XyzDrive());
    }
}

package DesignPaterrn.StrategyPattern;
/*
Define the Strategy Interface:

The DriveStrategy interface is defined with a single method drive().
Implement Concrete Strategies:

The NormalDrive, OffRoadDrive, SportsDrive, and XyzDrive classes implement the DriveStrategy interface and provide their own implementation of the drive() method.
Create the Context Class:

The Vehical class serves as the context class that encapsulates the driving behavior.
It has a member variable of type DriveStrategy named driveObj.
The constructor of Vehical takes a DriveStrategy object and assigns it to the driveObj variable.
The drive() method of Vehical class calls the drive() method of the driveObj.
Create Concrete Context Classes:

The GoodsVehical, offRoadVehical, SportsVehical, and ABC classes extend the Vehical class and provide their own constructors.
Each constructor calls the super() constructor of Vehical with the appropriate DriveStrategy object.
Use the Context Class:

In the main() method of the StrategyPattern class, different types of vehicles are instantiated.
The GoodsVehical object uses the NormalDrive strategy, the offRoadVehical object uses the OffRoadDrive strategy, the SportsVehical object uses the SportsDrive strategy, and the ABC object uses the XyzDrive strategy.
The drive() method is called on each object, and the respective strategy's drive() method is executed.
 */
// Step 1: Define the Strategy Interface
interface DriveStrategy {
    void drive();
}

// Step 2: Implement Concrete Strategies
class NormalDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Normal Drive Class");
    }
}

class OffRoadDrive implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Off Road Drive Class");
    }
}

class SportsDrive implements DriveStrategy {
    public void drive() {
        System.out.println("Sports Drive Class");
    }
}

// Step 3: Create the Context Class
class Vehical {
    DriveStrategy driveObj;

    Vehical(DriveStrategy driveObj) {
        this.driveObj = driveObj;
    }

    public void drive() {
        this.driveObj.drive();
    }
}

// Step 4: Create Concrete Context Classes
class GoodsVehical extends Vehical {
    GoodsVehical() {
        super(new NormalDrive());
    }
}

class offRoadVehical extends Vehical {
    offRoadVehical() {
        super(new OffRoadDrive());
    }
}

class SportsVehical extends Vehical {
    SportsVehical() {
        super(new SportsDrive());
    }
}

// Step 5: Use the Context Class
public class StrategyPattern {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Vehical obj = new GoodsVehical();
        Vehical off = new offRoadVehical();
        Vehical spo = new SportsVehical();

        // Drive the vehicles
        obj.drive(); // Outputs: Normal Drive Class
        off.drive(); // Outputs: Off Road Drive Class
        spo.drive(); // Outputs: Sports Drive Class
    }
}

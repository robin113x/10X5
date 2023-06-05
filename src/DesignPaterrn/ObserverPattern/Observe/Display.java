package DesignPaterrn.ObserverPattern.Observe;

public class Display implements DObserve {

    @Override
    public void update(int temp) {
        System.out.println("Temperature = "+temp);
    }
}

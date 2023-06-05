package DesignPaterrn.ObserverPattern;

import DesignPaterrn.ObserverPattern.OSubject.WeatherStation;
import DesignPaterrn.ObserverPattern.Observe.DObserve;
import DesignPaterrn.ObserverPattern.Observe.Display;

public class Main {
    public static void main(String[] args) {
        WeatherStation ws = new WeatherStation();
        DObserve d1 = new Display();
        DObserve d2 = new Display();
        ws.add(d1);
        ws.add(d2);
        ws.setData(20);
        ws.setData(30);

    }
}

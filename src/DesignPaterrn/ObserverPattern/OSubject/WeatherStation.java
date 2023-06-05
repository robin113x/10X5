package DesignPaterrn.ObserverPattern.OSubject;

import DesignPaterrn.ObserverPattern.Observe.DObserve;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements WStation{
    private List<DObserve> liObj = new ArrayList<DObserve>();
    private int temp;
    @Override
    public void add(DObserve dobj) {
        this.liObj.add(dobj);
    }

    @Override
    public void remove1(DObserve obj) {
        liObj.remove(obj);
    }

    @Override
    public void notifiy() {
        for(DObserve obj:liObj){
            obj.update(temp);
        }
    }

    @Override
    public void setData(int dat) {
        this.temp=dat;
        notifiy();
    }
}

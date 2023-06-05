package DesignPaterrn.ObserverPattern.OSubject;

import DesignPaterrn.ObserverPattern.Observe.DObserve;

public interface WStation {
    void add(DObserve dobj);
    void remove1(DObserve obj);

    void notifiy();
    void setData(int dat);
}

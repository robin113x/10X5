
import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(int temperature);
}

// Subject interface
interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}

// Concrete subject
class WeatherStation implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature);
        }
    }
}

// Concrete observer
class Display implements Observer {
    public void update(int temperature) {
        System.out.println("Temperature updated: " + temperature);
    }
}

public class Test {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Display display1 = new Display();
        Display display2 = new Display();

        weatherStation.registerObserver(display1);
        weatherStation.registerObserver(display2);

        weatherStation.setTemperature(25);

        weatherStation.removeObserver(display2);

        weatherStation.setTemperature(30);
    }
}

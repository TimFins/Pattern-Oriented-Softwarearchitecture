package Observer.SystemObserver;

import java.util.ArrayList;
import java.util.List;

public class CompositeObserver implements SystemObserver {
    private final List<SystemObserver> observers;

    public CompositeObserver() {
        observers = new ArrayList<SystemObserver>();
    }

    public List<SystemObserver> getObservers() {
        return observers;
    }

    public void addObserver(SystemObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(SystemObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (SystemObserver observer : observers) {
            observer.notifyObserver();
        }
    }
}

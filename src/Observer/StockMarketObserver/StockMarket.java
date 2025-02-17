package Observer.StockMarketObserver;

import java.util.ArrayList;
import java.util.List;

public class StockMarket {
    double currentPrice;
    List<Observer> observers;

    StockMarket(double currentPrice) {
        this.currentPrice = currentPrice;
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public double changePrice(double price) {
         this.currentPrice = price;

         notifyObservers();
         return price;
    }
}

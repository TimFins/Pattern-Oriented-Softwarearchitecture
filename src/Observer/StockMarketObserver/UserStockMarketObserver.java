package Observer.StockMarketObserver;

public class UserStockMarketObserver implements Observer {
    public UserStockMarketObserver() {}

    public void update() {
        System.out.println("UserStockMarketObserver updated so notify a user");
    }
}

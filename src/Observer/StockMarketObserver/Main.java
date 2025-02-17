package Observer.StockMarketObserver;

public class Main {
    public static void main(String[] args) {
        StockMarket market = new StockMarket(100);

        market.addObserver(new UserStockMarketObserver());

        market.changePrice(101);
    }
}

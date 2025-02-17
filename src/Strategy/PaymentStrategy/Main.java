package Strategy.PaymentStrategy;

public class Main {
    public static void main(String[] args) {
        Basket basket = new Basket(2000, new CreditCardStrategy());

        basket.proceedCheckout();
    }
}

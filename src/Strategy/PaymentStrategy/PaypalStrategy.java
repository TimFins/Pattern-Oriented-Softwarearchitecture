package Strategy.PaymentStrategy;

public class PaypalStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payed with paypal: " + amount + "€");
    }
}

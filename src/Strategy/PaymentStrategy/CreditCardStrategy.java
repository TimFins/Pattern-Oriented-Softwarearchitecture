package Strategy.PaymentStrategy;

public class CreditCardStrategy implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payed with credit card: " + amount + "€");
    }
}

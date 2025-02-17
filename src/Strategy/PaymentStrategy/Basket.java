package Strategy.PaymentStrategy;

public class Basket {
    public int amount;
    private PaymentStrategy paymentStrategy;

    public Basket(int amount, PaymentStrategy paymentStrategy) {
        this.amount = amount;
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void proceedCheckout() {
        paymentStrategy.pay(amount);
    }
}

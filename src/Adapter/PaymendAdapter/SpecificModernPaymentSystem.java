package Adapter.PaymendAdapter;

public class SpecificModernPaymentSystem implements ModernPaymentSystem {
    public static SpecificModernPaymentSystem system;

    private SpecificModernPaymentSystem() {}

    public static SpecificModernPaymentSystem getInstance() {
        if (system == null) {
            system = new SpecificModernPaymentSystem();
        }

        return system;
    }

    public void processPayment(double amount, String currency) {
        System.out.println("Making a payment in " + currency + ": " + amount);
    }
}

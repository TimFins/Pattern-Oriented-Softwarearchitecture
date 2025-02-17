package Adapter.PaymendAdapter;

public class LegacyPaymentSystem {
    public static LegacyPaymentSystem system;

    private LegacyPaymentSystem() {}

    public static LegacyPaymentSystem getInstance() {
        if (system == null) {
            system = new LegacyPaymentSystem();
        }

        return system;
    }

    public void makePaymentInDollars(double amount) {
        System.out.println("Making a payment in dollars: " + amount);
    }
}

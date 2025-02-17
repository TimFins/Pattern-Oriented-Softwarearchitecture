package Adapter.PaymendAdapter;

public class LegacyPaymentSystemAdapter implements ModernPaymentSystem {
    public static LegacyPaymentSystemAdapter system;

    private LegacyPaymentSystemAdapter() {}

    public static LegacyPaymentSystemAdapter getInstance() {
        if (system == null) {
            system = new LegacyPaymentSystemAdapter();
        }

        return system;
    }

    @Override
    public void processPayment(double amount, String currency) {
        if (currency.equals("EUR")) {
            System.out.println("Processing EUR Payment " + amount);
            LegacyPaymentSystem.getInstance().makePaymentInDollars(amount * 2);
        } else if (currency.equals("CZK")) {
            System.out.println("Processing CZK Payment " + amount);
            LegacyPaymentSystem.getInstance().makePaymentInDollars(amount * 10);
        } else if (currency.equals("USD")) {
            System.out.println("Processing USD Payment " + amount);
            LegacyPaymentSystem.getInstance().makePaymentInDollars(amount);
        }
    }
}

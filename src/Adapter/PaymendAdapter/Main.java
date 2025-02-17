package Adapter.PaymendAdapter;

public class Main {
    public static void main(String[] args) {
        LegacyPaymentSystemAdapter p1 = LegacyPaymentSystemAdapter.getInstance();
        p1.processPayment(100, "EUR");
        p1.processPayment(200, "CZK");
        p1.processPayment(300, "USD");

        ModernPaymentSystem p2 = SpecificModernPaymentSystem.getInstance();
        p2.processPayment(100, "EUR");
        p2.processPayment(200, "CZK");
    }
}

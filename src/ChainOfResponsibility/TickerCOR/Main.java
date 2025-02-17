package ChainOfResponsibility.TickerCOR;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket("BlaBla", "Delivery");

        Handler paymentHandler = new PaymentHandler();
        Handler deliveryHandler = new DeliveryHandler();

        paymentHandler.setNextHandler(deliveryHandler);

        paymentHandler.handleTicket(ticket);
    }
}

package ChainOfResponsibility.TickerCOR;

public class PaymentHandler extends Handler {
    public PaymentHandler() {
        super("Payment");
    }

    @Override
    public void handleTicket(Ticket ticket) {
        if (ticket.category.equals(this.category)) {
            System.out.println("The " + this.category + " handler is taking care of that.");
        } else {
            if (this.nextHandler != null) {
                System.out.println("The " + this.category + " handler is not taking care of that. I will pass it to the next one");
                this.nextHandler.handleTicket(ticket);
            } else {
                System.out.println("There is no next handler after the " + this.category + " handler.");
            }
        }
    }
}

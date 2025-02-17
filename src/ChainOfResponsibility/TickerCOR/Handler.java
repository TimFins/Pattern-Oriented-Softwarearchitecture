package ChainOfResponsibility.TickerCOR;

public abstract class Handler {
    String category;

    protected Handler nextHandler;

    Handler(String category) {
        this.category = category;
        this.nextHandler = null;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleTicket(Ticket ticket);
}

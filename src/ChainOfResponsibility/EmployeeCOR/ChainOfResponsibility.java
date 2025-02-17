package ChainOfResponsibility.EmployeeCOR;

public abstract class ChainOfResponsibility {
    public String topic;
    public ChainOfResponsibility cor;

    public ChainOfResponsibility(String topic, ChainOfResponsibility cor) {
        this.topic = topic;
        this.cor = cor;
    }

    public abstract void handle(Mail mail);
}

package ChainOfResponsibility.EmployeeCOR;

public class Employee extends ChainOfResponsibility{
    public Employee(String topic, ChainOfResponsibility cor) {
        super(topic, cor);
    }

    @Override
    public void handle(Mail mail) {
        if (mail.topic.equals(super.topic)) {
            System.out.println("I take care of that because the topics match.");
        } else {
            System.out.println("Not my topic, I try to go on to the next one");

            if (super.cor != null) {
                super.cor.handle(mail);
            } else {
                System.out.println("There is no next one.");
            }
        }
    }
}

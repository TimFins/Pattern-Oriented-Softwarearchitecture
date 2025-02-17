package Observer.SystemObserver;

public class Main {
    public static void main(String[] args) {
        CompositeObserver s1 = new CompositeObserver();
        s1.addObserver(new DatabaseObserver());
        s1.addObserver(new QueueObserver());
        s1.addObserver(new WebServerObserver());

        Server server = new Server(s1, new DatabaseObserver());

        server.restart();
        server.shutdown();
    }
}

package Observer.SystemObserver;

public class Server {
    SystemObserver restartObserver;

    SystemObserver shutdownObserver;

    public Server(SystemObserver restartObserver, SystemObserver shutdownObserver) {
        this.restartObserver = restartObserver;
        this.shutdownObserver = shutdownObserver;
    }

    public void restart() {
        System.out.println("Restarting System");

        restartObserver.notifyObserver();
    }

    public void shutdown() {
        System.out.println("Shutdown System");

        shutdownObserver.notifyObserver();
    }
}

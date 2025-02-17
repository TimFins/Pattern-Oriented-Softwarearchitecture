package Observer.SystemObserver;

public class WebServerObserver implements SystemObserver {
    @Override
    public void notifyObserver() {
        System.out.println("The web server is informed about the restart.");
    }
}

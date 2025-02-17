package Observer.SystemObserver;

public class QueueObserver implements SystemObserver {
    @Override
    public void notifyObserver() {
        System.out.println("The queue is informed about the restart.");
    }
}

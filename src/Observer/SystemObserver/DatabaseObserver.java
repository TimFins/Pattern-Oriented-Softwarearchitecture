package Observer.SystemObserver;

public class DatabaseObserver implements SystemObserver {
    @Override
    public void notifyObserver() {
        System.out.println("The database is informed about the restart.");
    }
}

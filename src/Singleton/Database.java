package Singleton;

public class Database {
    public String info;

    private static Database database;
    private Database() {
        this.info = "I am a database.";
    }

    public static Database getInstance() {
        if(database == null) {
            database = new Database();
        }

        return database;
    }

    public void printInfo() {
        System.out.println(this.info);
    }
}

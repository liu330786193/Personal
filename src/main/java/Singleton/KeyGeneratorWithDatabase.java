package Singleton;

/**
 * Created by lyl on 2017/4/13.
 */
public class KeyGeneratorWithDatabase {
    private static KeyGeneratorWithDatabase keyGenerator = new KeyGeneratorWithDatabase();
    private int key = 1000;
    private KeyGeneratorWithDatabase(){}
    private static KeyGeneratorWithDatabase getInstance(){
        return keyGenerator;
    }
    public synchronized int getNextKey(){
        return getNextKeyFromDB();
    }
    public int getNextKeyFromDB() {
        String sql1 = "UPDATE KeyTable SET keyValue = keyValue + 1";
        String sql2 = "SELECT keyValue FROM KeyTable";
        return 1000;
    }
}

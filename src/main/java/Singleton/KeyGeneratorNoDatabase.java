package Singleton;

/**
 * Created by lyl on 2017/4/13.
 */
public class KeyGeneratorNoDatabase {
    private static KeyGeneratorNoDatabase keyGenerator = new KeyGeneratorNoDatabase();
    private int key = 1000;
    private KeyGeneratorNoDatabase(){}
    private static KeyGeneratorNoDatabase getInstance(){
        return keyGenerator;
    }
    public synchronized int getNextKey(){
        return key++;
    }
}

package Singleton;

/**
 * Created by lyl on 2017/4/13.
 */
public class KeyGeneratorWithCache {
    private static final int POOL_SIZE = 20;
    private static KeyGeneratorWithCache keygen = new KeyGeneratorWithCache();
    private KeyInfo key;
    private KeyGeneratorWithCache(){
        key = new KeyInfo(POOL_SIZE);
    }
    private static KeyGeneratorWithCache getInstance(){
        return keygen;
    }
    public synchronized int getNextKey(){
        return key.getNextKey();
    }
}

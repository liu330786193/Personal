package Singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lyl on 2017/4/13.
 */
public class KeyGeneratorMultiWithCache {
    private static final int POOL_SIZE = 20;
    private static Map keyList = new ConcurrentHashMap(10);
    private KeyInfoMulti keygen;
    private KeyGeneratorMultiWithCache(){}
    private KeyGeneratorMultiWithCache(String keyName){
        keygen = new KeyInfoMulti(POOL_SIZE, keyName);
    }
    private synchronized static KeyGeneratorMultiWithCache getInstance(String keyName){
        KeyGeneratorMultiWithCache keyGen;
        if (keyList.containsKey(keyName)){
            keyGen = (KeyGeneratorMultiWithCache) keyList.get(keyName);
        }else {
            keyGen = new KeyGeneratorMultiWithCache(keyName);
        }
        return keyGen;
    }
    public synchronized int getNextKey(){
        return keygen.getNextKey();
    }
}

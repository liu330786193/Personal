package Singleton;

/**
 * Created by lyl on 2017/4/13.
 */
public class KeyInfoMulti {
    private int keyMax;
    private int keyMin;
    private int nextKey;
    private int poolSize;
    private String keyName;
    public KeyInfoMulti(int poolSize, String keyName){
        this.poolSize = poolSize;
        this.keyName = keyName;
        retriveFromDB();
    }
    public int getKeyMax(){
        return keyMax;
    }
    public int getKeyMin(){
        return keyMin;
    }
    public int getNextKey() {
        if (nextKey > keyMax){
            retriveFromDB();
        }
        return nextKey++;
    }
    private void retriveFromDB() {
        String sql1 = "UDPATE KeyTable SET keyValue = keyValue + " + poolSize
                + "WHERE keyName = " + keyName;
        String sql2 = "SELECT keyValue FROM KeyTable WHERE keyName = " + keyName;
        int keyFromDB = 1000;
        keyMax = keyFromDB;
        keyMin = keyFromDB - poolSize + 1;
        nextKey = keyMin;
    }
}

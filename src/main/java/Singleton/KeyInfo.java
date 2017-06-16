package Singleton;

/**
 * Created by lyl on 2017/4/13.
 */
public class KeyInfo {
    private int keyMax;
    private int keyMin;
    private int nextKey;
    private int poolSize;
    public KeyInfo(int poolSize){
        this.poolSize = poolSize;
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
                + "WHERE keyName = 'po_NUMBER'";
        String sql2 = "SELECT keyValue FROM KeyTable WHERE keyName = 'po_NUMBER'";
        int keyFromDB = 1000;
        keyMax = keyFromDB;
        keyMin = keyFromDB - poolSize + 1;
        nextKey = keyMin;
    }
}

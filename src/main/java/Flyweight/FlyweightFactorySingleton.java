package Flyweight;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by lyl on 2017/4/19.
 */
public class FlyweightFactorySingleton {
    private HashMap files = new HashMap();
    private static FlyweightFactorySingleton instance = new FlyweightFactorySingleton();
    private FlyweightFactorySingleton(){}
    public static FlyweightFactorySingleton getInstance(){
        return instance;
    }
    public synchronized Flyweight factory(Character state){
        if (files.containsKey(state)){
            return (Flyweight) files.get(state);
        }else {
            Flyweight fly = new ConcreteFlyweight(state);
            files.put(state, fly);
            return fly;
        }
    }
    public void checkFlyweight(){
        Flyweight fly;
        int i = 0;
        System.out.println("\n==========chechFlyweight()===========");
        for (Iterator it = files.entrySet().iterator(); it.hasNext();){
            Map.Entry e = (Map.Entry) it.next();
            System.out.println("Item" + (++i) + ":" + e.getKey());
        }
        System.out.println("\n==========checkFlyweight()===========");
    }
}

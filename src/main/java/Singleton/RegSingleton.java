package Singleton;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by lyl on 2017/4/12.
 */
public class RegSingleton {
    //登记式单例类
    private static Map m_registry = new ConcurrentHashMap();
    static {
        RegSingleton x = new RegSingleton();
        m_registry.put(x.getClass().getName(), x);
    }

    public RegSingleton() {
    }

    public static RegSingleton getInstance(String name){
        if (name == null){
            name = "Singleton.RegSingleton";
        }
        if (m_registry.get(name) == null){
            try {
                m_registry.put(name, Class.forName(name).newInstance());
            }catch (Exception e){
                System.out.println("Erro happened");
            }
        }
        return (RegSingleton)(m_registry.get(name));
    }

}

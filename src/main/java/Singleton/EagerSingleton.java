package Singleton;

/**
 * Created by lyl on 2017/4/12.
 */
public class EagerSingleton {

    private static final EagerSingleton m_instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return m_instance;
    }
}

package Singleton;

/**
 * Created by lyl on 2017/4/12.
 */
public class LazySingleton {

    private static LazySingleton m_instance = null;

    private LazySingleton() {
    }
    //加锁处理多线程
    synchronized public static LazySingleton getInstance(){
        if (m_instance == null){
            m_instance = new LazySingleton();
        }
        return m_instance;
    }
}

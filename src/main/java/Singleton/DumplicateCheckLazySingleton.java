package Singleton;

/**
 * Created by lyl on 2017/4/13.
 */
public class DumplicateCheckLazySingleton {
    private static DumplicateCheckLazySingleton m_instance = null;
    private DumplicateCheckLazySingleton(){}
    public static DumplicateCheckLazySingleton getInstance(){
        if (m_instance == null){
            synchronized (DumplicateCheckLazySingleton.class){
                if (m_instance == null){
                    m_instance = new DumplicateCheckLazySingleton();
                }
            }
        }
        return m_instance;
    }
}

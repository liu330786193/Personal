package Singleton;

/**
 * Created by lyl on 2017/4/12.
 */
public class RegSingletonChild extends RegSingleton {


    public RegSingletonChild() {
    }

    public static RegSingletonChild getInstance(){
        return (RegSingletonChild)RegSingleton.getInstance("Singleton.RegSingletonChild");
    }
}

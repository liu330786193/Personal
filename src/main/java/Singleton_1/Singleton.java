package Singleton_1;

/**
 * Created by lyl on 2017/6/16.
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton(){
        System.out.println("生成了一个实例");
    }
    public static Singleton getSingleton(){
        return singleton;
    }
}

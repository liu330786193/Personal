package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

/**
 * Created by lyl on 2017/4/18.
 */
public class VectorProxy implements InvocationHandler {

    private Object proxyObj;

    public VectorProxy(Object proxyObj) {
        this.proxyObj = proxyObj;
    }

    public static Object factory(Object obj){
        Class cls = obj.getClass();
        return Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), new VectorProxy(obj));
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before calling " + method);
        if (args != null){
            for (int i = 0; i < args.length; i++){
                System.out.println(args[i] + "");
            }
        }
        Object o = method.invoke(proxyObj, args);
        System.out.println("after calling " + method);
        return o;
    }

    public static Object getProxyInstance(Class obj){
        return Proxy.newProxyInstance(obj.getClassLoader(), obj.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before calling " + method);
                if (args != null){
                    for (int i = 0; i < args.length; i++){
                        System.out.println(args[i] + "");
                    }
                }
                Object o = method.invoke(obj.newInstance(), args);
                System.out.println("after calling " + method);
                return o;
            }
        });
    }

    public static Object getProxyInstance1(Class obj){
        return Proxy.newProxyInstance(obj.getClassLoader(), obj.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("before calling " + method);
                if (args != null){
                    for (int i = 0; i < args.length; i++){
                        System.out.println(args[i] + "");
                    }
                }
                Object o = method.invoke(obj.newInstance(),args);
                System.out.println("after calling " + method);
                return 0;
            }
        });
    }

    public static void main(String[] args){
        List v = null;
        v = (List) VectorProxy.getProxyInstance(Vector.class);
        v.add("new");
        v.add("York");
    }
}

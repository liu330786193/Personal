package TemplateMethod;

/**
 * Created by lyl on 2017/4/20.
 */
public abstract class AbstractClass {

    public void templetMethod(){
        doOperation1();
        doOperation2();
        doOperation3();
    }

    private final void doOperation3() {
        System.out.println("doOperation3");
    }

    protected abstract void doOperation2();

    protected abstract void doOperation1();

}

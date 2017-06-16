package TemplateMethod.Polymorphic;

/**
 * Created by lyl on 2017/4/20.
 */
public abstract class AbstractClass {

    public void bigMethod(){
        step1();
        step2();
        newMethod();
    }

    protected abstract void newMethod();

    protected void step2(){}

    protected void step1(){}


}

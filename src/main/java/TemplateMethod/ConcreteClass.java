package TemplateMethod;

/**
 * Created by lyl on 2017/4/20.
 */
public class ConcreteClass extends AbstractClass {

    @Override
    public void doOperation2() {
        System.out.println("doOperation2");
    }

    @Override
    public void doOperation1() {
        System.out.println("doOperation1");
    }

}

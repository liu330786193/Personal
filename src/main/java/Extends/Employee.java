package Extends;

/**
 * Created by lyl on 2017/6/13.
 */
public abstract class Employee {

    public static Employee create(){
        return new Employee() {
            @Override
            void youAreField() {
                System.out.println("你被解雇了");
            }
        };
    }
    abstract void youAreField();

}

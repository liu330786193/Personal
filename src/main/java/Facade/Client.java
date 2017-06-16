package Facade;

/**
 * Created by lyl on 2017/4/19.
 */
public class Client {

    public static void main(String[] args) {
        new SecurityFacade().activate();
        new SecurityFacade().deactivate();
    }

}

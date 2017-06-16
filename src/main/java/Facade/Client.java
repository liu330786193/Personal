package Facade;

import org.junit.Test;

/**
 * Created by lyl on 2017/4/19.
 */
public class Client {

    @Test
    public void test(){
        new SecurityFacade().activate();
        new SecurityFacade().deactivate();
    }

}

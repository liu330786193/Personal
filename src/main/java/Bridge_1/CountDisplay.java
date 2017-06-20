package Bridge_1;

import javax.rmi.CORBA.Tie;

/**
 * Created by lyl on 2017/6/20.
 */
public class CountDisplay extends Bridge {

    public CountDisplay(Display display) {
        super(display);
    }

    public void multiDisplay(int times){
        open();
        for (int i = 0; i < times; i++){
            print();
        }
        close();
    }

}

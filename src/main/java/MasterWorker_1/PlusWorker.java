package MasterWorker_1;

/**
 * Created by lyl on 2017/4/29.
 */
public class PlusWorker extends Worker {

    @Override
    public Object handle(Object input) throws InterruptedException {
        Integer i = (Integer) input;
        return i*i*i;
    }
}

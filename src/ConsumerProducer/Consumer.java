package ConsumerProducer;

import java.text.MessageFormat;
import java.util.Random;
import java.util.concurrent.BlockingDeque;

/**
 * Created by lyl on 2017/4/29.
 */
public class Consumer implements Runnable {

    private BlockingDeque<PCData> queue;
    private static final int SLEEPTIME = 1000;

    public Consumer(BlockingDeque<PCData> queue){
        this.queue = queue;
    }

    @Override
    public void run() {
        System.out.println("start Consumer id = " + Thread.currentThread().getId());
        Random random = new Random();
        try {
            while (true){
                PCData data = queue.take();
                if (null != data){
                    int re = data.getIntData() * data.getIntData();
                    Thread.sleep(random.nextInt(SLEEPTIME));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }
}

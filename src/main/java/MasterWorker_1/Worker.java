package MasterWorker_1;

import java.util.Map;
import java.util.Queue;

/**
 * Created by lyl on 2017/4/29.
 */
public class Worker implements Runnable {

    protected Queue<Object> workQueue;
    protected Map<String, Object> resultMap;

    public void setWorkQueue(Queue<Object> workQueue) {
        this.workQueue = workQueue;
    }

    public void setResultMap(Map<String, Object> resultMap) {
        this.resultMap = resultMap;
    }

    public Object handle(Object input) throws InterruptedException {
        return input;
    }

    @Override
    public void run() {
        while (true){
            Object input = workQueue.poll();
            if (input == null){
                break;
            }
            Object re = null;
            try {
                re = handle(input);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("re: " + re);
            resultMap.put(Integer.toBinaryString(input.hashCode()), re);
        }
    }
}

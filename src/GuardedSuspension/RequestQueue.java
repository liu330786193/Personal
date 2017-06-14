package GuardedSuspension;

import java.util.LinkedList;

/**
 * Created by lyl on 2017/4/29.
 */
public class RequestQueue {

    private LinkedList queue = new LinkedList();
    public synchronized Request getRequest(){
        while (queue.size() == 0){
            try {
                wait();
            }catch (InterruptedException e){

            }
        }
        return (Request) queue.remove();
    }

    public synchronized void addRequest(Request request){
        queue.add(request);
        notifyAll();
    }


}

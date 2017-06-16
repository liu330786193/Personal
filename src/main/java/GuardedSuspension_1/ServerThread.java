package GuardedSuspension_1;

/**
 * Created by lyl on 2017/4/29.
 */
public class ServerThread extends Thread {

    private RequestQueue requestQueue;
    public ServerThread(RequestQueue requestQueue, String  name){
        super(name);
        this.requestQueue = requestQueue;
    }

    @Override
    public void run() {
        while (true){
            final Request request = requestQueue.getRequest();
            try {
                Thread.sleep(100); //模拟请求耗时操作
            }catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " handles" + request);
        }
    }
}

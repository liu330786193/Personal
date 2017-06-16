package ThreadPool_1;

/**
 * Created by lyl on 2017/4/29.
 */
public class PThread extends Thread {

    private ThreadPool pool;
    private Runnable target;
    private boolean isShutDown = false;
    private boolean isIdle = false;

    public PThread(ThreadPool pool, String name, Runnable target) {
        super(name);
        this.pool = pool;
        this.target = target;
    }

    public Runnable getTarget() {
        return target;
    }

    public boolean isIdle() {
        return isIdle;
    }

    @Override
    public void run() {
        while (!isShutDown){
            isIdle = false;
            if (target != null){
                target.run();
            }
            isIdle = true;
            try {
                pool.repool(this);
                synchronized (this){
                    wait();
                }
            }catch (Exception e){

            }
            isIdle = false;
        }
    }

    public synchronized void setTarget(Runnable newTarget){
        target = newTarget;
        notifyAll();
    }

    public synchronized void shutdown(){
        isShutDown = true;
        notifyAll();
    }
}

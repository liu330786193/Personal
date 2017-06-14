package ThreadPool;

import java.util.List;
import java.util.Vector;

/**
 * Created by lyl on 2017/4/29.
 */
public class ThreadPool {

    private static ThreadPool install = null;
    private List<PThread> idleThreads;
    private int threadCounter;
    private boolean isShutdown = false;
    private ThreadPool(){
        this.idleThreads = new Vector<PThread>(5);
        threadCounter = 0;
    }
    public int getCreatedThreadsCount(){
        return threadCounter;
    }
    public synchronized static ThreadPool getInstance(){
        if (install == null){
            install = new ThreadPool();
        }
        return install;
    }
    protected synchronized void repool(PThread repoolingThread){
        if (!isShutdown){
            idleThreads.add(repoolingThread);
        }else {
            repoolingThread.shutdown();
        }
    }
    public synchronized void shutdown(){
        isShutdown = true;
        for (int threadIndex = 0; threadIndex < idleThreads.size(); threadIndex++){
            PThread idleThread = idleThreads.get(threadIndex);
            idleThread.shutdown();
        }
    }
    public synchronized void start(Runnable target){
        PThread thread = null;
        if (idleThreads.size() > 0){
            int lastIndex = idleThreads.size() - 1;
            thread = idleThreads.get(lastIndex);
            idleThreads.remove(lastIndex);
            thread.setTarget(target);
        }else {
            threadCounter++;
            thread = new PThread(this, "PThread #" + thread, target);
            thread.start();
        }
    }

}

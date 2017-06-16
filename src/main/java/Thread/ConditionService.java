package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by lyl on 2016/11/16.
 */
public class ConditionService {

    private ReentrantLock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();
    private boolean hasValue = false;

    public void methodA(){
        try {
            lock.lock();
            if (hasValue == true){
                System.out.println("★★★");
                condition.await();
            }
            System.out.println("★");
            hasValue = true;
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void methodB(){
        try {
            lock.lock();
            if (hasValue == false){
                System.out.println("☆☆☆");
                condition.await();
            }
            System.out.println("☆");
            hasValue = false;
            condition.signalAll();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

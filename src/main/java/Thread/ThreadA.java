package Thread;

/**
 * Created by lyl on 2016/11/16.
 */
public class ThreadA extends Thread {

    private ConditionService conditionService;

    public ThreadA(ConditionService service){
        super();
        this.conditionService = service;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++){
            conditionService.methodA();
        }
    }
}

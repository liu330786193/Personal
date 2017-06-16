package Thread;

public class Main {

    public static void main(String[] args) {

        ConditionService conditionService = new ConditionService();
        Thread[] threadsA = new Thread[10];
        Thread[] threadsB = new Thread[10];
        for (int i = 0; i < 10; i++){
            threadsA[i] = new ThreadA(conditionService);
            threadsA[i].start();
            threadsB[i] = new ThreadB(conditionService);
            threadsB[i].start();
        }
    }
}

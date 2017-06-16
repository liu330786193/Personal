package Thread;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by lyl on 2016/11/16.
 */
public class TimerTest {

    private static Timer timer = new Timer();
    private static int runCount = 0;
    static public class MyTask extends TimerTask{

        @Override
        public void run() {
            try {
                System.out.println("begin 运行了！时间为：" + new Date());
                Thread.sleep(5000);
                System.out.println("end 运行了！时间为：" + new Date());
                runCount++;
                if (runCount == 5){
                    timer.cancel();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args){
        try {
            MyTask myTask = new MyTask();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String dataString = "2016-11-16 16:23:00";
            Date dateRef = sdf.parse(dataString);
            System.out.println("字符串时间：" + dateRef.toString() + "当前时间：" + new Date().toString());
            timer.scheduleAtFixedRate(myTask, dateRef, 3000);
            System.out.println("-------------");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}

package Duty;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by lyl on 2017/4/23.
 */
public class DrumBeanter {

    private static Player firstPlayer;
    public static boolean stopped = false;
    Timer timer;

    public static void main(String[] args) {
        DrumBeanter drumBeanter = new DrumBeanter();
        JiaMu jiaMu = new JiaMu(null);
        jiaMu.setSuccessor(new JiaShe(new JiaZheng(new JiaBaoYu(new JiaHuan(jiaMu)))));
        drumBeanter.startBeating(1);
        firstPlayer = jiaMu;
        firstPlayer.handle();
    }

    public void startBeating(int stopInSeconds){
        System.out.println("Drum beating started");
        timer = new Timer();
        timer.schedule(new StopBeatingReminder(), stopInSeconds * 1000);
    }


    private class StopBeatingReminder extends TimerTask {
        @Override
        public void run() {
            System.out.println("Drum beating stopped!");
            stopped = true;
            timer.cancel();
        }
    }
}































package State_1;

import Interpreter.Context;

/**
 * Created by lyl on 2017/6/22.
 */
public class DayState implements State {

    private static DayState singleton = new DayState();

    private DayState(){
    }

    public static State getInstance(){
        return singleton;
    }

    @Override
    public void doClock(int hour) {
        if (hour < 9 || 17 <= hour){
            System.out.println("使用闹钟 白天");
        }
    }

    @Override
    public void doUse(Context context) {
        System.out.println("使用金库 白天");
    }

    @Override
    public void doAlarm(Context context) {
        System.out.println("按下警铃 白天");
    }

    @Override
    public void doPhone(Context context) {
        System.out.println("正常通话 白天");
    }

    @Override
    public String toString() {
        return "[白天]";
    }
}

package State_1;

import Interpreter.Context;

/**
 * Created by lyl on 2017/6/22.
 */
public class NightState implements State {

    private static NightState singleton = new NightState();

    private static State getInstance(){
        return singleton;
    }

    @Override
    public void doClock(int hour) {
        System.out.println("使用闹钟 晚上");
    }

    @Override
    public void doUse(Context context) {
        System.out.println("使用金库 晚上");
    }

    @Override
    public void doAlarm(Context context) {
        System.out.println("按下警铃 晚上");
    }

    @Override
    public void doPhone(Context context) {
        System.out.println("正在通话 晚上");
    }

    @Override
    public String toString() {
        return "[晚上]";
    }
}

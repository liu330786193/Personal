package State_1;

import Interpreter.Context;

/**
 * Created by lyl on 2017/6/22.
 */
public interface State {
    void doClock(int hour);
    void doUse(Context context);
    void doAlarm(Context context);
    void doPhone(Context context);
}

package State.WallOriginal;

/**
 * Created by lyl on 2017/4/24.
 */
public class Transition {

    public final static int STATE_LOCKED = 1;
    public final static int STATE_UNLOCKED = 2;
    public final static int EVENT_SPELL = 4;
    public final static int EVENT_PASS = 8;

    public Transition(int event) {

        int state = STATE_UNLOCKED;
        switch (state){
            case STATE_UNLOCKED:
                switch (event){
                    case  EVENT_SPELL:
                        state = STATE_UNLOCKED;
                        break;
                    case  EVENT_PASS:
                        Bang();
                        break;
                }
                break;
            case STATE_LOCKED:
                switch (event){
                    case EVENT_SPELL:
                        state = STATE_UNLOCKED;
                        break;
                    case EVENT_PASS:
                        state = STATE_LOCKED;
                        break;
                }
                break;
        }

    }

    private void Bang() {
        System.out.println("You are damned");
    }
}

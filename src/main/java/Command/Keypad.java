package Command;

/**
 * Created by lyl on 2017/4/24.
 */
public class Keypad {

    private Command playCmd;
    private Command rewindCmd;
    private Command stopCmd;

    public Keypad(Command playCmd, Command rewindCmd, Command stopCmd) {
        this.playCmd = playCmd;
        this.rewindCmd = rewindCmd;
        this.stopCmd = stopCmd;
    }

    public void play(){
        playCmd.execute();
    }

    public void stop(){
        stopCmd.execute();
    }

    public void rewind(){
        rewindCmd.execute();
    }

}

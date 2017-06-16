package Command;

/**
 * Created by lyl on 2017/4/24.
 */
public class Keypad {

    private Command.Command playCmd;
    private Command.Command rewindCmd;
    private Command.Command stopCmd;

    public Keypad(Command.Command playCmd, Command.Command rewindCmd, Command.Command stopCmd) {
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

package Command;

/**
 * Created by lyl on 2017/4/24.
 */
public class RewindCommand implements Command.Command {

    private Command.AudioPlayer audioPlayer;

    public RewindCommand(Command.AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}

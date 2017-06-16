package Command;

/**
 * Created by lyl on 2017/4/24.
 */
public class PlayCommand implements Command {

    private AudioPlayer myAudio;


    public PlayCommand(AudioPlayer myAudio) {
        this.myAudio = myAudio;
    }

    @Override
    public void execute() {
        myAudio.play();
    }

}

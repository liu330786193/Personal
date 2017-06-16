package Command;

/**
 * Created by lyl on 2017/4/24.
 */
public class User {

        private static Keypad keypad;
        private static AudioPlayer audioPlayer = new AudioPlayer();

    public static void main(String[] args) {
        Command play = new PlayCommand(audioPlayer);
        Command stop = new StopCommand(audioPlayer);
        Command rewind = new RewindCommand(audioPlayer);
        /*keypad = new Keypad(play,rewind, stop);
        keypad.play();
        keypad.stop();
        keypad.rewind();*/
        MacroCommand macroCommand = new MacroAudioCommand();
        macroCommand.add(play);
        macroCommand.add(stop);
        macroCommand.add(rewind);
        macroCommand.execute();
    }

}

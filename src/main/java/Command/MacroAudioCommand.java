package Command;

import java.util.Vector;

/**
 * Created by lyl on 2017/4/24.
 */
public class MacroAudioCommand implements MacroCommand {

    private Vector<Command> cmdList = new Vector();

    @Override
    public void execute() {
        cmdList.stream().forEach(l -> l.execute());
    }

    @Override
    public void remove(Command command) {
        cmdList.removeElement(command);
    }

    @Override
    public void add(Command command) {
        cmdList.addElement(command);
    }
}

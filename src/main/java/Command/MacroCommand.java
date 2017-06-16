package Command;

/**
 * Created by lyl on 2017/4/24.
 */
public interface MacroCommand extends Command.Command {

    void remove(Command.Command command);

    void add(Command.Command command);

}

package Command;

/**
 * Created by lyl on 2017/4/24.
 */
public interface MacroCommand extends Command {

    void remove(Command command);

    void add(Command command);

}

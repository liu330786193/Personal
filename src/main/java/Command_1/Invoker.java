package Command_1;

/**
 * Created by lyl on 2017/4/23.
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.execute();
    }
}

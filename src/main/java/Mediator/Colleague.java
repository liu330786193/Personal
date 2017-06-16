package Mediator;

/**
 * Created by lyl on 2017/4/25.
 */
public abstract class Colleague {

    private Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public abstract void action();

    public void change(){
        mediator.colleagueChanged(this);
    }

}

package Decorator;

/**
 * Created by lyl on 2017/4/18.
 */
public class Change {

    private Monkey m;

    public Change(Monkey m){
        super();
        this.m = m;
    }

    public void move(){
        m.move();
    }

}

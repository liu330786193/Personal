package Duty;

/**
 * Created by lyl on 2017/4/23.
 */
public class JiaMu extends Player {

    public JiaMu(Player successor) {
        super(successor);
    }

    @Override
    public void handle() {
        if (DrumBeanter.stopped){
            System.out.println("Jia Mu gotta drink!");
        }else {
            System.out.println("Jia Mu passed!");
            next();
        }
    }
}

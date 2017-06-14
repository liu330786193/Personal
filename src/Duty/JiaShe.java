package Duty;

/**
 * Created by lyl on 2017/4/23.
 */
public class JiaShe extends Player {

    public JiaShe(Player successor) {
        super(successor);
    }

    @Override
    public void handle() {
        if (DrumBeanter.stopped){
            System.out.println("Jia She gotta drink!");
        }else {
            System.out.println("Jia She passed!");
            next();
        }
    }
}

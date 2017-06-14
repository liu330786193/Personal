package Duty;

/**
 * Created by lyl on 2017/4/23.
 */
public class JiaHuan extends Player {

    public JiaHuan(Player successor) {
        super(successor);
    }

    @Override
    public void handle() {
        if (DrumBeanter.stopped){
            System.out.println("Jia Huan gotta drink!");
        }else {
            System.out.println("Jia Huan passed!");
            next();
        }
    }
}

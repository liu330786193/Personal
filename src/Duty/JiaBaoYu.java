package Duty;

/**
 * Created by lyl on 2017/4/23.
 */
public class JiaBaoYu extends Player {

    public JiaBaoYu(Player successor) {
        super(successor);
    }

    @Override
    public void handle() {
        if (DrumBeanter.stopped){
            System.out.println("Jia Bao Yu gotta drink!");
        }else {
            System.out.println("Jia Bao Yu passed!");
            next();
        }
    }
}

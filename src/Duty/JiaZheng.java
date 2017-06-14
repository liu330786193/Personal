package Duty;

/**
 * Created by lyl on 2017/4/23.
 */
public class JiaZheng extends Player {

    public JiaZheng(Player successor) {
        super(successor);
    }

    @Override
    public void handle() {
        if (DrumBeanter.stopped){
            System.out.println("Jia Zheng gotta drink!");
        }else {
            System.out.println("Jia Zheng passed!");
            next();
        }
    }
}

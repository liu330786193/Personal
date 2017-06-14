package Duty;

/**
 * Created by lyl on 2017/4/23.
 */
public abstract class Player {

    public abstract void handle();
    private Player successor;

    public Player(Player successor) {
        this.successor = successor;
    }

    public void setSuccessor(Player successor) {
        this.successor = successor;
    }

    public void next(){
        if (successor != null){
            successor.handle();
        }else {
            System.out.println("Program is terminatig");
            System.exit(0);
        }
    }


}

































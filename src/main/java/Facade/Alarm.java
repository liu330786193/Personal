package Facade;

/**
 * Created by lyl on 2017/4/19.
 */
public class Alarm {

    public void activate(){
        System.out.println("Activating the alarm");
    }

    public void deactivate(){
        System.out.println("Deactivate the alarm");
    }

    public void ring(){
        System.out.println("Ring the alarm");
    }

    public void stopRing(){
        System.out.println("stop the alarm");
    }

}

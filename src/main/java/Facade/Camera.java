package Facade;

/**
 * Created by lyl on 2017/4/19.
 */
public class Camera {

    public void turnOn(){
        System.out.println("Turning on the camera");
    }

    public void turnOff(){
        System.out.println("Turning off the camera");
    }

    public void rotate(int degrees){
        System.out.println("rotate the camera" + degrees + " degrees");
    }

}

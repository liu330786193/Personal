package Facade;

/**
 * Created by lyl on 2017/4/19.
 */
public class SecurityFacade {

    private Camera camera1 = new Camera(), camera2 = new Camera();
    private Light light1 = new Light(), light2 = new Light(), light3 = new Light();
    private Sensor sensor = new Sensor();
    private Alarm alarm = new Alarm();

    public void activate(){
        camera1.turnOn();
        camera2.turnOn();
        light1.turnOn();
        light2.turnOn();
        light3.turnOn();
        sensor.activate();
        alarm.activate();
    }

    public void deactivate(){
        camera1.turnOff();
        camera2.turnOff();
        light1.turnOff();
        light2.turnOff();
        light3.turnOff();
        sensor.deactivate();
        alarm.deactivate();
    }


}

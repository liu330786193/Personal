package Observer.Watched;

import java.util.Observable;

/**
 * Created by lyl on 2017/4/21.
 */
public class Watched extends Observable {

    private String data = "";

    public String retrieveData(){
        return data;
    }

    public void changeData(String data){
        if (!this.data.equals(data)){
            this.data = data;
            setChanged();
        }
        notifyObservers();
    }

}

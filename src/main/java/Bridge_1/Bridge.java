package Bridge_1;


/**
 * Created by lyl on 2017/6/20.
 */
public class Bridge {

    private Display display;

    public Bridge(Display display){
        this.display = display;
    }

    public void open(){
        display.rawOpen();
    }

    public void print(){
        display.rawPrint();
    }

    public void close(){
        display.rawClose();
    }

    public final void display(){
        open();
        print();
        close();
    }

}

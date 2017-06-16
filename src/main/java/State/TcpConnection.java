package State;

/**
 * Created by lyl on 2017/4/24.
 */
public class TcpConnection {

    private TcpState state;

    public void open(){
        state.open();
    }

    public void setState(TcpState state) {
        this.state = state;
    }

    public void close(){
        state.close();
    }

    public void acknowledge(){
        state.acknowledge();
    }

}

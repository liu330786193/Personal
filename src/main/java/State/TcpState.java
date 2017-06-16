package State;

/**
 * Created by lyl on 2017/4/24.
 */
public interface TcpState {

    void open();
    void close();
    void acknowledge();

}

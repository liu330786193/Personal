package State;

/**
 * Created by lyl on 2017/4/24.
 */
public class TcpEstablished implements TcpState {
    @Override
    public void open() {
        System.out.println("TCP OPEN");
    }

    @Override
    public void close() {
        System.out.println("TCP CLOSE");
    }

    @Override
    public void acknowledge() {
        System.out.println("TCP ACKNOWLEDGE");
    }

}

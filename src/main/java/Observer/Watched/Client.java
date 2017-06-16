package Observer.Watched;

/**
 * Created by lyl on 2017/4/21.
 */
public class Client {

    public static void main(String[] args) {
        Watched watched = new Watched();
        new Watcher(watched);
        watched.changeData("AAA");
    }

}

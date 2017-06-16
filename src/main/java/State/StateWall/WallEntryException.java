package State.StateWall;

/**
 * Created by lyl on 2017/4/24.
 */
public class WallEntryException extends Exception {

    public WallEntryException(String message) {
        super(message);
        System.out.println(message);
    }

}

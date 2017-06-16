package State.StateWall;

/**
 * Created by lyl on 2017/4/24.
 */
public interface WallStateIF {

    void spell(WallEntry wall, String spell) throws WallEntryException;
    void pass(WallEntry wall) throws WallEntryException;

}

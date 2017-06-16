package State.StateWall;

/**
 * Created by lyl on 2017/4/24.
 */
public class WallEntry {

    private WallStateIF state;

    public void setState(WallStateIF state){
        this.state = state;
    }

    public void pass() throws WallEntryException{
        state.pass(this);
    }

    public void spell(String spell) throws WallEntryException{
        state.spell(this, spell);
    }

}

package State.StateWall;

import java.util.Date;

/**
 * Created by lyl on 2017/4/24.
 */
public class LockedState implements WallStateIF {

    private Date timeOfLock;
    private static String rightSpell = "天机不可泄露";

    public LockedState() {
    }

    @Override
    public void spell(WallEntry wall, String spell) throws WallEntryException {
        if (spell.equals(rightSpell)){
            wall.setState(new UnlockedState());
        }else {
            throw new WallEntryException("Wrong spell!!!");
        }
    }

    @Override
    public void pass(WallEntry wall) throws WallEntryException {
        throw new WallEntryException("Bang!!!");
    }

    public Date getTimeOfLock() {
        return timeOfLock;
    }

    public void setTimeOfLock(Date timeOfLock) {
        this.timeOfLock = timeOfLock;
    }

}

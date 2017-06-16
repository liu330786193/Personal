package State.StateWall;

import java.util.Date;

/**
 * Created by lyl on 2017/4/24.
 */
public class UnlockedState implements WallStateIF {

    private Date timeOfUnlock;

    public UnlockedState() {
        this.setTimeOfUnlock(new Date());
    }

    @Override
    public void spell(WallEntry wall, String spell) throws WallEntryException {

    }

    @Override
    public void pass(WallEntry wall) throws WallEntryException {
        wall.setState(new LockedState());
    }

    public Date getTimeOfUnlock() {
        return timeOfUnlock;
    }

    public void setTimeOfUnlock(Date timeOfUnlock) {
        this.timeOfUnlock = timeOfUnlock;
    }
}

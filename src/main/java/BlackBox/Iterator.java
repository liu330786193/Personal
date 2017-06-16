package BlackBox;

/**
 * Created by lyl on 2017/4/21.
 */
public interface Iterator {

    void first();

    void next();

    boolean isDone();

    Object currentItem();

}

package Chain;

/**
 * Created by lyl on 2017/6/21.
 */
public class OddSupport extends Support {

    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1){
            return true;
        }else {
            return false;
        }
    }

}

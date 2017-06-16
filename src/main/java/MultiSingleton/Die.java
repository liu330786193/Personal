package MultiSingleton;

import java.util.Date;
import java.util.Random;

/**
 * Created by lyl on 2017/4/13.
 */
public class Die {
    private final static Die die1 = new Die();
    private final static Die die2 = new Die();
    private Die(){}
    public static Die getInstance(int whichOne){
        if (whichOne == 1){
            return die1;
        }else if (whichOne == 2){
            return die2;
        }
        return null;
    }
    public synchronized int dice(){
        int value = new Random(new Date().getTime()).nextInt();
        value = Math.abs(value) % 6;
        value += 1;
        return value;
    }
}

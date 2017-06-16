package Flyweight;

/**
 * Created by lyl on 2017/4/19.
 */
public class ConcreteFlyweight extends Flyweight {

    private Character instrinsicState = null;

    public ConcreteFlyweight(Character state) {
        this.instrinsicState = state;
    }

    @Override
    void operation(String state) {
        System.out.println("\nIntrinsic State = " + instrinsicState + ", Extrinsic State = " + state);
    }
}

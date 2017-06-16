package Builder;

import org.junit.Test;

/**
 * Created by lyl on 2017/4/13.
 */
public class Director {

    private Builder builder;

    @Test
    public void construce(){
        builder = new ConcreteBuilder();
        builder.buildPart1();
        builder.buildPart2();
        builder.retrieveResult();
    }

}

package Builder;

/**
 * Created by lyl on 2017/4/13.
 */
public class Director {

    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        builder.buildPart1();
        builder.buildPart2();
        builder.retrieveResult();
    }

}

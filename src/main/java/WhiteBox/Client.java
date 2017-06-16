package WhiteBox;

/**
 * Created by lyl on 2017/4/21.
 */
public class Client {

    private static Iterator it;
    private static Aggregate aggregate = new ConcreteAggregate();

    public static void main(String[] args) {
        it = aggregate.createIterator();
        while (!it.isDone()){
            System.out.println(it.currentItem().toString());
            it.next();
        }

    }

}

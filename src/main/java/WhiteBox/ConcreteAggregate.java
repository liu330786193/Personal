package WhiteBox;

/**
 * Created by lyl on 2017/4/21.
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] obj = {"Monk Tang","Monkey","Pigsy","Sandy", "Horse"};

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }

    public Object getElement(int index){
        if (index < obj.length){
            return obj[index];
        }else {
            return null;
        }
    }

    public int size(){
        return obj.length;
    }

}

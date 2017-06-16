package BlackBox;

/**
 * Created by lyl on 2017/4/21.
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] obj = {"Monk Tang","Monkey","Pigsy","Sandy", "Horse"};

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator();
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

    public class ConcreteIterator implements Iterator{

        private int currentIndex = 0;

        @Override
        public void first() {
            currentIndex = 0;
        }

        @Override
        public void next() {
            if (currentIndex < obj.length){
                currentIndex++;
            }
        }

        @Override
        public boolean isDone() {
            return currentIndex == obj.length;
        }

        @Override
        public Object currentItem() {
            return obj[currentIndex];
        }
    }

}

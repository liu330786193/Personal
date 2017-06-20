package Composite_1;

/**
 * Created by lyl on 2017/6/20.
 */
public abstract class Entry {
    abstract String getName();
    abstract int getSize();
    public Entry add(Entry entry){
        throw new RuntimeException();
    }
    public void printList(){
        printList("");
    }

    abstract void printList(String prefix);

    @Override
    public String toString() {
        return getName() + "(" + getSize() + ")";
    }
}

package Composite_1;

/**
 * Created by lyl on 2017/6/20.
 */
public class File extends Entry {

    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    int getSize() {
        return size;
    }

    @Override
    void printList(String prefix) {
        System.out.println(prefix + "/" + this);
    }
}

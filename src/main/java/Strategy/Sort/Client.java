package Strategy.Sort;

/**
 * Created by lyl on 2017/4/20.
 */
public class Client {

    public static void main(String[] args) {
        new Sorter(new BinSort()).sort();
        new Sorter(new HeapSort()).sort();
        new Sorter(new QuickSort()).sort();
        new Sorter(new RadixSort()).sort();
    }

}

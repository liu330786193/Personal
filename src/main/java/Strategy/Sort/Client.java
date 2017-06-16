package Strategy.Sort;

import org.junit.Test;

/**
 * Created by lyl on 2017/4/20.
 */
public class Client {

    @Test
    public void test(){
        new Sorter(new BinSort()).sort();
        new Sorter(new HeapSort()).sort();
        new Sorter(new QuickSort()).sort();
        new Sorter(new RadixSort()).sort();
    }

}

package Strategy.Sort;

/**
 * Created by lyl on 2017/4/20.
 */
public class Sorter {

    private SortStrategy sortStrategy;

    public Sorter(SortStrategy sortStrategy) {
        this.sortStrategy = sortStrategy;
    }

    public void sort(){
        sortStrategy.sort();
    }
}

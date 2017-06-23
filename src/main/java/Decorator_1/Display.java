package Decorator_1;

/**
 * Created by lyl on 2017/6/21.
 */
public abstract class Display {
    abstract int getColumns();
    abstract int getRows();
    abstract String getRowText(int row);
    public final void show(){
        for (int i = 0; i< getRows(); i++){
            System.out.println(getRowText(i));
        }
    }
}


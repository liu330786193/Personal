package Decorator_1;

/**
 * Created by lyl on 2017/6/21.
 */
public class StringDisplay extends Display {

    private String str;

    public StringDisplay(String str){
        this.str = str;
    }

    @Override
    int getColumns() {
        return str.getBytes().length;
    }

    @Override
    int getRows() {
        return 1;
    }

    @Override
    String getRowText(int row) {
        if (row == 0){
            return str;
        }else {
            return null;
        }
    }
}

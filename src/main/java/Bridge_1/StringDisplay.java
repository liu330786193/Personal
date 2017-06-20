package Bridge_1;

/**
 * Created by lyl on 2017/6/20.
 */
public class StringDisplay implements Display {

    private String str;
    private int width;

    public StringDisplay(String str){
        this.str = str;
        this.width = str.getBytes().length;
    }

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void rawClose() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}

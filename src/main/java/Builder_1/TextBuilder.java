package Builder_1;

/**
 * Created by lyl on 2017/6/16.
 */
public class TextBuilder implements Builder {

    private StringBuffer buffer = new StringBuffer();

    @Override
    public void makeTitle(String title) {
        buffer.append("==================\n");
        buffer.append("[" + title + "]");
        buffer.append("\n");
    }

    @Override
    public void makeString(String str) {
        buffer.append("☆" + str + "\n");
        buffer.append("\n");
    }

    @Override
    public void makeItems(String[] items) {
        for (int i = 0; i < items.length; i++){
            buffer.append(" ." + items[i] + "\n");
        }
        buffer.append("\n");
    }

    @Override
    public void close() {
        buffer.append("==================");
    }

    public String getResult(){
        return buffer.toString();
    }
}
